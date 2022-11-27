package Array;

public class max_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {1,3,6,8,9,422,-99};
		System.out.println(MAX(ar));
	}
	public static int MAX(int []arr) {
		int m=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>m) {
				m=arr[i];
			}
		}
		return m;
	}

}
