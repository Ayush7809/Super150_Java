package lec3;
import java.util.*;
public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int D= S.nextInt();
		int Di= S.nextInt();
		
		while(Di%D!=0) {
			int rem = Di%D;
			Di = D;
			D= rem;
		}
		System.out.println(D);
	}

}
