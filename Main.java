import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            
            int cnt = 0;
            int tot = m / n + 3;
            int f = -1;
            
            while (s1.length() < s2.length()) {
                s1 += s1;
                cnt++;
            }
            
            if (s1.contains(s2)) {
                System.out.println(cnt);
                continue;
            }
            
            s1 += s1;
            
            if (s1.contains(s2)) {
                System.out.println(cnt + 1);
                continue;
            }
            
            s1 += s1;
            
            if (s1.contains(s2)) {
                System.out.println(cnt + 2);
                continue;
            }
            
            System.out.println(-1);
            
            t--;
        }
    }
}
