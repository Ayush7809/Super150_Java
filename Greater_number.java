package Lec2;
import java.util.*;
public class Greater_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int a = S.nextInt();
		int b = S.nextInt();
		int c = S.nextInt();
		if(a>b && b>c) {
			System.out.println(a);
		}
		else if(b>a&& a>c){
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}

}
