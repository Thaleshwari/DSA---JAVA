import java.util.*;
public class PascalTriangle {
    public static List<List<Integer>> generate(int row){
        List<List<Integer>> res=new ArrayList<>();

        for(int i=0;i<row;i++){
            List<Integer> curr = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    curr.add(1);
                }
                else{
                    curr.add(res.get(i-1).get(j-1)+ res.get(i-1).get(j));
                }
            }
            res.add(curr);
        }



        return res;




    }



    public static void main(String[] args){
        List<List<Integer>> res=new ArrayList<>();
        res = generate(5);
        System.out.println(res);
    }
}
