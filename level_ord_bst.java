import java.util.*;
public class level_ord_bst {
    public class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;

    public level_ord_bst(){
        root = createtree();
    }
    Scanner S = new Scanner(System.in);
    private Node createtree(){
        int item  = S.nextInt();
        Node nn = new Node();
        nn.data =item;
        boolean hlc = S.nextBoolean();
        if(hlc==true){
            nn.left = createtree();
        }
        boolean hrc = S.nextBoolean();
        if(hrc==true){
            nn.right = createtree();
        }
        return nn;
    }
    public void levelorder(){
        //LinkedList<Node> queue = new LinkedList<>();
        Queue<Node> q = new LinkedList<>();
        Queue<Node> h = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rv = q.remove();
            //System.out.print(rv.data+" ");
            ll.add(rv.data);
            if(rv.left!=null){
                q.add(rv.left);
            }
            if(rv.right!=null){
                h.add(rv.right);
            }
            if(q.isEmpty()){
                q= h;
                h = new LinkedList<>();
                ans.add(ll);
                ll= new ArrayList<>();
            }
        } 
        System.out.println(ans);
        System.out.println();   
    }
    public static void main(String[] args) {
        level_ord_bst bt = new level_ord_bst();
        bt.levelorder();
    }
}
