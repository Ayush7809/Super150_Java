package lec5;

public class swap_array1 {

	public static void main(String[] args) {
		// TODO Auto-generated// TODO Auto-generated method stub
		int [] arr = {1,2,3,6,-7};
		int [] br= {6,7,8,9,5};
		System.out.println(arr[0] +" "+br[1]);
		swap(arr , br);
		System.out.println(arr[0]+" "+br[1]);
	}
	public static void swap(int [] arr, int []br) {
		int[] temp =arr;
		arr=br;
		br= temp;
		
	 

	}

}
