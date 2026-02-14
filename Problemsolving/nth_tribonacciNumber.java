public class nth_tribonacciNumber {
    public static int tribonacci(int n) {
        if(n==0)
        return 0;
        
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            if(i==2)
            dp[i]=dp[i-1]+dp[i-2];
            else
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];

        }

        return dp[n];
        
 
}
public static void main(String[] args){
    int ans=tribonacci(5);
    System.err.println(ans);
}
}
