public class canSum {
   
    static boolean subset(int[] arr,int n){
        boolean[] dp=new boolean[n+1];
        //base case :
        dp[0]=true;
        for(int i=0;i<=n;i++){
            if(dp[i]){
                for(int j=0;j<arr.length;j++){
                    if(i+arr[j]<=n)
                    dp[i+arr[j]]=true;
                }
            }
            
        }
        return dp[n];
            
    }
	public static void main(String[] args) {
		int[] arr={7,12};
		System.out.println(subset(arr,26));
	}
}


