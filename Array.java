package lec5;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int n= S.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]= S.nextInt();
		}
		display(arr);
	}
	public static void display(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
	}

}
