package String_lec;

public class String_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		//System.out.println(sb.length());
		//System.out.println(sb.capacity());
		sb.append("ahdskjddhn");
		sb.append("ahsudeq");
		System.out.println(sb.length());
		System.out.println(sb.capacity());// StringBuilder ki capacity m 2*old capacity+2 se badta h
		sb.insert(1, "ll");
		System.out.println(sb);
		String s = sb.toString();// Builder to String 
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(2));
		System.out.println(sb.substring(1,3));
	}
}
