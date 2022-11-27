package String_lec;
import java.util.Scanner;
public class goodsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String str = S.next();
		System.out.println(goodno(str));
	}
	public static int goodno(String s) {
		int count =0; 
		int ans =0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(vowels(ch)==true) {
				count++;
			}
			else {
				ans = Math.max(ans, count);
				count=0;
			}
		}
		ans=Math.max(ans, count);
		return ans;
	}
	public static boolean vowels(char c) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			return true;
		}
		return false;
	}

}
