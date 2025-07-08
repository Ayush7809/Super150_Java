import java.util.*;

public class ayush{
    public class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;

    public ayush(){
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
    public static void main(String[] args) {
    //10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
        ayush ay = new ayush();
        ay.Display();
    }
}
