package Array;

public class range_reverse{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar= {2,3,3,5,6,12,134,4,5,1,3};
		reverse(ar,2,7);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+ " ");
		}
	}
	public static void reverse(int []ar,int i,int j) {

		
		 j=ar.length-1;
		while(i<j) {
			int t= ar[i];
			ar[i]=ar[j];
			ar[j]=t;
			i++;
			j--;
		}

  }
}
