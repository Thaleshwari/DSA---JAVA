// Finding Min Moves for Knight
/*
Inputs are starting point(sx,sy) and destination point(tx,ty)

I used the Visited matrix for knowing the (x,y) is already visited or not

constraints : 
   if n value is larger ,then don't use backtracking because it cause stack overflow error

*/
public class KnightMinMoves {
    static int minMoves=Integer.MAX_VALUE;
    static int[] dx={1,1,2,2,-1,-1,-2,-2};
    static int[] dy={2,-2,1,-1,2,-2,1,-1};
    static int findMinMoves(int n,int sx,int sy,int tx,int ty){
        boolean[][] visited = new boolean[n][n];
        dfs(n,sx,sy,tx,ty,visited,0);

        return minMoves==Integer.MAX_VALUE ? -1 : minMoves;
    }

    static void dfs(int n,int sx,int sy,int tx,int ty,boolean[][] visited,int moves){
        //goal
        if(sx==tx && sy==ty){
            minMoves=Math.min(minMoves,moves);
            return;
        }


        //pruning
        if(moves>minMoves)
        return;

        //backtracking
        visited[sx][sy]=true;
        for(int i=0;i<8;i++){
            int nx=sx+dx[i];
            int ny=sy+dy[i];
            if(nx>=0 && ny>=0 && nx<n&& ny<n && !visited[nx][ny])
            dfs(n, nx, ny, tx, ty, visited, moves+1);
        }

        visited[sx][sy]=false;

        return;
    }


    public static void main(String[] args){
        int n=8;
        int ans=findMinMoves(n,0,0,7,7);
        System.out.println("Minimum Moves : "+ans);
    }
    
}
