package Array;

public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {1,3,1,3,2,4,422,-99};
		reverse(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+ " ");
		}
	}
	public static void reverse(int []ar) {

		int i=0;
		int j=ar.length-1;
		while(i<j) {
			int t= ar[i];
			ar[i]=ar[j];
			ar[j]=t;
			i++;
			j--;
		}
		
	}

}
