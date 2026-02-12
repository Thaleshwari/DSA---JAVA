/*
You are given an array of CPU tasks, each labeled with a letter from A to Z, and a number n. Each CPU interval can be idle or allow the completion of one task. Tasks can be completed in any order, but there's a constraint: there has to be a gap of at least n intervals between two tasks with the same label.

Return the minimum number of CPU intervals required to complete all tasks.
*/
import java.util.*;
public class TaskSchedular {
    public static int solve(char[] tasks,int n){
        int time=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        int max=0,count=0;
        for(int num: map.values()){
            
            if(max<num)
            max=num;

            if(max==num)
            count++;
        }

       

        time=(max-1)*(n+1)+count;


        



        return Math.max(tasks.length,time);
    }
    

    public static void main(String[] args) {
        char[] task={'A','A','A','B','B','B'};
        int n=3;
        System.out.println(solve(task,n));
    }
}
