package Array;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-2,-5,-6,-5,-7};
		System.out.println(maxsum(arr));
		}
	public static int maxsum(int[] arr) {
		int n=arr.length;
		int ans= Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum+=arr[j];
				ans = Math.max (sum, ans);
			}
		}
		return ans;
	}

}
