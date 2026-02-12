package SlidingWindow;
import java.util.*;

public class LongestSubstringWithoutDuplicate {

    public static int solve(String s){
        int size=0;
        HashSet<Character> set=new HashSet<>();
        int left=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
            }

            set.add(s.charAt(right));
            size=Math.max(size,set.size());
        }



        return size;
    }
    public static void main(String[] args){
        String s="abcdeabcbbzxcerd";
        System.out.println(solve(s));
    }
}
