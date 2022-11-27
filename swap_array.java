package lec5;

public class swap_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,6,-7};
		System.out.println(arr[0] +" "+arr[1]);
		swap(arr ,0,1);
		System.out.println(arr[0]+" "+arr[1]);
	}
	public static void swap(int []arr, int b, int c) {
		int temp =arr[b];
		arr[b]=arr[c];
		arr[c]= temp;
		
	}

}
