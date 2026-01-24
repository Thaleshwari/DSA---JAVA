// Mice Path find using Backtacking
/*  
starting point (0,0) 
Destination point (n-1,n-1);
constraint : The Mice moves down or right

I use solution matrix for finding the path... i make it (x,y)=1 if it valid path, 
else (x,y)=0;
*/
public class Mice {
    static int[][] grid = { { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 1, 0, 0, 1 }, { 1, 0, 0, 0 } };

    static boolean findPath(int n, int x, int y, int[][] soln) {
        // Goal
        if (x == n - 1 && y == n - 1) {
            soln[x][y] = 1;
            return true;
        }

        // validity
        if (x >=n || y >= n || grid[x][y] == 1)
            return false;

        // backtracking

        soln[x][y] = 1;

        if (findPath(n, x + 1, y, soln))
            return true;

        if (findPath(n, x, y + 1, soln))
            return true;

        soln[x][y] = 0;

        return false;
    }

    public static void main(String[] args) {
        int[][] soln = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
        int n = 4;
        if (findPath(n, 0, 0, soln)) {
            System.out.println("There is a Path");
            for (int i = 0; i < soln.length; i++) {
                for (int j = 0; j < soln[0].length; j++) {
                    System.out.print(soln[i][j] + " ");
                }
                System.out.println();

            }
        } else {
            System.out.println("There is No Path");
        }
    }
}