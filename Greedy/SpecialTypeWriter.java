public class SpecialTypeWriter {
    public static int typeWriter(String str){
        // initialize result
        int time=0;
        // initialize current state
        char curr='a';

        // iterate every character in string

        for(char c:str.toCharArray()){
            // Make best Choice
            int diff=Math.abs(curr-c);
            time+=Math.min(diff,26-diff); // update the result
            time+=1;
            //update the state
            curr=c;
        }





        return time;

    }
    



    public static void main(String[] args){
        int ans=typeWriter("bza");
        System.out.println(ans);
    
    }
}
