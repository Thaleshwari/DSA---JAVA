// Find subset of target sum using backtracking

/*
constrait : when the array also contain negative values,in that backtracking is failed

*/
import java.util.*;
public class TargetSum {
    static ArrayList<Integer> list=new ArrayList<>();
    static boolean findTargetSum(int[] arr,int target,int index,int sum){
        //goal
        if(sum==target)
        return true;

        //validity
        if(index>=arr.length)
        return false;
        
        //pruning
        if(sum>target)
        return false;

        //backtracking

       list.add(arr[index]);
        if(findTargetSum(arr, target, index+1, sum+arr[index])){
            
        return true;
        }
        list.remove(list.size()-1);
      
        //exclude
        if(findTargetSum(arr, target, index+1, sum))
        return true;

        return false;

    }

    public static void main(String[] args){
        int[] arr={1,3,5,7,9};
        
        int target = 11;
        findTargetSum(arr,target,0,0);
        System.out.println(list);

    }
}
