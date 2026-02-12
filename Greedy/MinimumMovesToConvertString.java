/*
You are given a string s consisting of n characters which are either 'X' or 'O'.

A move is defined as selecting three consecutive characters of s and converting them to 'O'. Note that if a move is applied to the character 'O', it will stay the same.

Return the minimum number of moves required so that all the characters of s are converted to 'O'.
*/
public class MinimumMovesToConvertString {
    public static int solve(String s){
        int count=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='X'){
                count++;
                i+=3;
            }
            else
            i++;
        }
        return count;
    }

    public static void main(String[] args){
        String s="XXX";
        System.out.println(solve(s));
    }
    
}
