
import java.util.*;

public class question1{
    public class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;

    public question1(){
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
    public void Display(){
        Display(root);
    }
    private void Display(Node nn){
        if(nn==null){
            return;
        }
        String s ="";
        s ="<--"+nn.data+"-->";
        if(nn.left!=null){
            s = nn.left.data +s;
        }
        else{
            s = "."+s;
        }
        if(nn.right!=null){
            s+= nn.right.data;
        }
        else{
            s += ".";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }
    public int max(){
        return max(root);
    }
// maximum find krne ke liye

    private int max(Node nn){
        if(nn== null){
            return Integer.MIN_VALUE;
        }
        int left = max(nn.left);
        int right = max(nn.right);
        return Math.max(nn.data , Math.max(left, right));
    }
// item find krne ke liye

    public boolean find(int item){
        return find(root, item);
    }
    private boolean find(Node nn, int item){
        if(nn==null){
            return false;
        }
        if(nn.data==item){
            return true;
        }
        boolean left = find(nn.left, item);
        boolean right = find(nn.right, item);
        return left ||right;
    }

    // to find height
    public int ht(){
        return ht(root);
    }

    private int ht(Node nn){
        if(nn== null){
            return -1;//single node ki height 0 aayega to yha -1 lena h
            // single node ki height 1 aayega to yha pr 0 lena padega
        }
        int lh = ht(nn.left);
        int rh = ht(nn.right);
        return Math.max(lh, rh)+1;
    }

    //preorder traversal
    public void PreOrder(){
        PreOrder(root);
        System.out.println();
    }
    public void PreOrder(Node node){
        if(node == null)
            return;
    
    System.out.println(node.data+" ");
    PreOrder(node.left);
    PreOrder(node.right);
    }
     //Postorder traversal
    public void PostOrder(){
        PostOrder(this.root);
        System.out.println();
    }

    public void PostOrder(Node node){
        if(node == null)
            return;

        PostOrder(node.left);
        PostOrder(node.right);
        System.out.println(node.data+ " ");
    }

    // Inorder Traversal
    public void Inorder(){
        Inorder(this.root);
        System.out.println();
    }
     
    public void Inorder(Node nn){
        if(nn==null){
            return;
        }
        Inorder(nn.left);
        System.out.println(nn.data+" ");
        Inorder(nn.right);
    }

    //Level order Traversal
    public void levelorder(){
        //LinkedList<Node> queue = new LinkedList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rv = q.remove();
            System.out.println(rv.data+" ");
            if(rv.left!=null){
                q.add(rv.left);
            }
            if(rv.right!=null){
                q.add(rv.right);
            }
        } 
        System.out.println();   
    }
}