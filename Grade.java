package Lec2;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int m = S.nextInt();
		if (m>=70) {
			System.out.println("A");
		}
		else if (m>=60 && m<70) {
			System.out.println("B");
		}
		else if(m>=50 && m<60) {
			System.out.println("c");
		}
		else if(m>=40 && m<50) {
			System.out.println("D");
		}
		else if(m>=30 && m<40 ) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
