/* 
A company is planning to interview 2n people. Given the array costs where costs[i] = [aCosti, bCosti], the cost of flying the ith person to city a is aCosti, and the cost of flying the ith person to city b is bCosti.

Return the minimum cost to fly every person to a city such that exactly n people arrive in each city.
 */
import java.util.*;
public class TwoCityScheduling {
    public static int minCost(int[][] cost){
        int profit=0;
        Arrays.sort(cost, (a,b)->{
           return (a[0]-a[1])-(b[0]-b[1]);
        });

        for(int i=0;i<cost.length;i++){
            if(i<cost.length/2)
            profit+=cost[i][0];

            else
            profit+=cost[i][1];
        }



        return profit;
    }


    public static void main(String[] args){
        int[][] cost = {{10,20},{30,200},{400,50},{30,20}};
        int ans=minCost(cost);
        System.out.print("Minimum Cost : "+ans);
    }
    
}
