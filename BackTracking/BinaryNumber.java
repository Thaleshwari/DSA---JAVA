// generate the binary numbers of length n using BackTracking 

import java.util.*;
public class BinaryNumber {
    static void generateBinaryNumbers(int n,StringBuilder sb){
        //goal
        if(sb.length()==n){
            System.out.println(sb.toString());
            return;
        }

        //backtracking
        sb.append("0");
        generateBinaryNumbers(n, sb);
        sb.setCharAt(sb.length()-1, '1');
        generateBinaryNumbers(n, sb);

        //exclude
        sb.deleteCharAt(sb.length()-1);

        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        generateBinaryNumbers(n,new StringBuilder());

        sc.close();
    }
}
