 package String_lec;

public class palindromic_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "naman";
		printsubstring(str);
		
	}   
	public static void printsubstring(String st) {
		for(int i=0;i<st.length();i++) {
			for(int j=i+1;j<=st.length();j++) {
				String s1 = st.substring(i,j);
				if(isPalindromString(s1)==true) {
					System.out.println(s1);
				}
			}
		}
	}
	public static boolean isPalindromString(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	

}
