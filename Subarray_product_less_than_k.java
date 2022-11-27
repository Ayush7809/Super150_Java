package Sliding_Window;

public class Subarray_product_less_than_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,4,3,2};
		int k=10;
		System.out.println(CountSubArray(arr,k));
	}
	// Variable type sliding window jisme size change ho rha ho
	public static int CountSubArray(int []arr,int k) {
		int ans =0,si=0,ei=0,p=1;
		while(ei<arr.length) {
			//grow
			p*=arr[ei];
			//shrink
			while(p>=k && si<=ei) {
				p/=arr[si];
				si++;
			}
			ans = ans+(ei-si+1);
			ei++;
		}
		return ans;
	}

}
