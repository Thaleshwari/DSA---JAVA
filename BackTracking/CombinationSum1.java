// Combination Sum 1 leetcode problem
/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.
*/

import java.util.*;
public class CombinationSum1
{
    static List<List<Integer>>l=new ArrayList<>();
    static void sum(int[] arr,int tar,int res, int i,List<Integer> list){
        //goal
        if(res==tar){
            List<Integer> temp=new ArrayList<>();
            for(int n: list)
            temp.add(n);
            l.add(temp);
            return;
     
        }
        
        //validity
        if(tar<res|| i>=arr.length)
        return;
        

        //BackTracking
        list.add(arr[i]);
        
        sum(arr,tar,res+arr[i],i,list);
    
        list.remove(list.size()-1);

        //Exclude
        sum(arr,tar,res,i+1,list);
        return;
        
  
        
        
    }
	public static void main(String[] args) {
		int[] arr={2,3,5};
		
		sum(arr,8,0,0,new ArrayList<>());
		System.out.println(l);
	}
}
