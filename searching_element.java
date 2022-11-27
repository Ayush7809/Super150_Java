package Array;
//import java.util.*;
public class searching_element {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {2,4,-1,7,3,8,9};
		int item = 9;
				System.out.println(findindex(ar,item));
	}
	public static int findindex(int[] ar, int item) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==item) {
				return i;
			}
		}
		return -1;
	}

}
