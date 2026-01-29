import java.util.*;
public class CombinationSum {
    static List<List<Integer>> sum(int[] arr,int n){
       @SuppressWarnings("unchecked")
       List<List<Integer>>[] dp = (List<List<Integer>>[]) new ArrayList[n + 1];
        for(int i=0;i<=n;i++)
        dp[i]=new ArrayList<>();

        dp[0].add(new ArrayList<>());

        for(int num : arr){
            for(int sum=num;sum<=n;sum++){
                for(List<Integer> prev: dp[sum-num]){
                    List<Integer> curr=new ArrayList<>(prev);
                    curr.add(num);
                    dp[sum].add(curr);
                }
            }
        }




        return dp[n];
    }
    public static void main(String[] args){
        int[] arr={7,12};
        List<List<Integer>> ans=sum(arr,26);
        System.out.println(ans);
    }
}
