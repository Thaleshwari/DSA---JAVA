import java.util.LinkedList;
import java.util.Queue;
 class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

public class numberOfIsland {
   
    public static void main(String[] args){
        char[][] grid={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(numIslands(grid));
    }
    
    
    public static int numIslands(char[][] grid) {

        Queue<Pair> queue=new LinkedList<>();
        int count=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                boolean found=false;
                if(grid[i][j]=='1'){
                    queue.add(new Pair(i,j));
                    while(!queue.isEmpty()){
                        found=true;
                      Pair curr=queue.poll();
                      int dx=curr.x;
                      int dy=curr.y;
                      if(dx+1< grid.length && grid[dx+1][dy]=='1'){
                        queue.add(new Pair(dx+1,dy));
                        grid[dx+1][dy]='2';
                      }
                      if(dy+1<grid[0].length && grid[dx][dy+1]=='1'){
                        queue.add(new Pair(dx,dy+1));
                        grid[dx][dy+1]='2';
                      }
                        if(dx-1>=0 && grid[dx-1][dy]=='1'){
                        queue.add(new Pair(dx-1,dy));
                        grid[dx-1][dy]='2';
                      }
                      if(dy-1>=0 && grid[dx][dy-1]=='1'){
                        queue.add(new Pair(dx,dy-1));
                        grid[dx][dy-1]='2';
                      }

                    }
                    if(found)
                    count++;


                }

            }
        }

        return count;
       
        
        
    }

}

