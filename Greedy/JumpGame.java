public class JumpGame {
    public static boolean canJump(int[] arr){
        //initialize result
        int maxJump=0;
        for(int i=0;i<arr.length;i++){
            if(i>maxJump)
            return false;

            maxJump=Math.max(maxJump, i+arr[i]);
        }




        return true;
    }
    

    public static void main(String[] args){
        int[] arr={2,1,0,1,4};
        System.out.println(canJump(arr));
    }
}
