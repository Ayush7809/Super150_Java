package lec3;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int a=0;
		int b=1;
		int c=0;
		
		for(int i=0;i<n;i++) {
			c=a+b;
			b=a;
			a=c;
			
		}
		System.out.println(a);
		
	}

}
