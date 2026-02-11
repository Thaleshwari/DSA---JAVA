
/*
Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.

 
*/
import java.util.*;
public class AssignCookies {
    public static int calculate(int[] children , int[] cookies){
        int i=children.length;
        int j=cookies.length;
        Arrays.sort(children);
        Arrays.sort(cookies);

        while(i<children.length && j<cookies.length){
            if(children[i]>=cookies[j])
            i++;

            j++;
        }



        return i;
  
    }

    public static void main(String[] args){
        int[] children= {1,2,3};
        int[] cookies={1,1};
        System.out.println("Maximum "+ calculate(children,cookies));
    }
}
