package String_lec;
import java.util.*;
public class ReversewordinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String str =S.nextLine();
		System.out.println(reverseword(str));
	}
	public static String reverseword(String s) {
		s=s.trim();
        String []arr = s.split("\s+");
        String ans ="";
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i]+" ";
        }
        ans = ans.trim();
        return ans;
	}

}
