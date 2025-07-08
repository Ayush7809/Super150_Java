public class question1_client {
    public static void main(String[] args) {
        //10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
        question1 bt = new question1();
        bt.Display();
        System.out.println(bt.max());
        System.out.println(bt.find(20));
        System.out.println(bt.ht());
        bt.PreOrder();
        bt.PostOrder();
        bt.Inorder();
        bt.levelorder();
    }
}
