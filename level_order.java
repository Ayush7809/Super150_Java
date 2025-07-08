
import java.util.*;
public class level_order{
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner S = new Scanner(System.in);
    public level_order() {
        CreateTree();
    }
    private void CreateTree() {
        int item = S.nextInt();
        Node nn = new Node();
        nn.val = item;
        root = nn;
        Queue<Node> q = new LinkedList<>();
        q.add(nn);
        while(!q.isEmpty()){
            Node rv = q.remove();
            int c1 = S.nextInt();
            int c2 = S.nextInt();
            if(c1!=-1){
                Node ll = new Node();
                ll.val = c1;
                rv.left = ll;
                q.add(ll);
            }
            if(c2!=-1){
                Node ll = new Node();
                ll.val = c2;
                rv.right = ll;
                q.add(ll);
            }
        }
    
    }
    public void preOrder(){
        preOrder(root);
        System.out.println();
    }
    private void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        level_order bt = new level_order();
        bt.preOrder();
    }
}