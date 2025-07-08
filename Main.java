import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int t = S.nextInt(); // Number of test cases

        while(t-- > 0){
            int a = S.nextInt();
            int b = S.nextInt();
            int c = S.nextInt();
            System.out.println(minmoves(a, b, c));  
        }  
    }

    public static int minmoves(int a, int b, int c){
        if(a == b) 
            return 0;
        int diff = Math.abs(a - b);
        double f =  (double) diff / 2;
        if(f <= c)
            return 1;
        return (int) Math.ceil(f / c); // Round up to the nearest integer
    }
}
