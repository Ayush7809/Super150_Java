package lec4;
import java.util.*;
public class binary_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S= new Scanner(System.in);
		int n = S.nextInt();
		int base =S.nextInt();
		int sum =0;
		int mul =1;
		while(n>0) {
			int rem = n%base;
			sum =sum+ rem*mul;
			n=n/base;
			mul= mul*10;
		}
		System.out.println(sum);
	}

}
