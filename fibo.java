public class fibo{
    public static void main(String [] args){
        int n = 5;
        int[] dp = new int [n+1];
        System.out.println(fib(n));
        System.out.println(fibtd(n , dp));
        System.out.println(fibBU(n));
    }
    //by using recurrsion
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int f1 = fib(n-1);
        int f2 = fib(n-2);
        return f1+f2;
    }
    
    //by using dp(top-bottom)
    public static int fibtd(int n, int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0)
            return dp[n];
        int f1 = fibtd(n-1, dp);
        int f2 = fibtd(n-2, dp);
        return dp[n] = f1+f2;
    } 


    //by  using dp(bottom - top)

    public static int fibBU(int n){
        int[] dp = new int[n+1];
        dp[0] =0;
        dp[1] = 1;
        for(int i=2;i<dp.length;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}