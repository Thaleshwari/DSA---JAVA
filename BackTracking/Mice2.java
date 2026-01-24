// Mice Problem 2

/*
In this problem mice can move up,down,left or right
*/

public class Mice2 {
    static int[][] grid={{0,1,0,0,0},{0,0,0,1,0},{1,1,0,1,0},{1,1,0,1,0},{1,1,1,1,0}};
    static boolean findPath(int n,int x,int y,int[][] soln){
        //goal
        if(x==n-1 && y==n-1){
            soln[x][y]=1;
            return true;
        }

        //validity
        if(x>=n || y>=n || x<0 || y<0 || grid[x][y]==1 || soln[x][y]==1)
        return false;

        //backtracking
        soln[x][y]=1;
        if(findPath(n,x+1,y,soln))
        return true;

        if(findPath(n,x,y+1,soln))
        return true;

        if(findPath(n,x-1,y,soln))
        return true;

        if(findPath(n,x,y-1,soln))
        return true;

        soln[x][y]=0;

        return false;
    }


    public static void main(String[] args){
        int n=5;
        int[][] soln={{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        if(findPath(n,0,0,soln)){
            System.out.println("There is a Path");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(soln[i][j]+" ");
                }
                System.out.println();
            }

        }
        else{
            System.out.println("There is no Path");
        }
    }
}
