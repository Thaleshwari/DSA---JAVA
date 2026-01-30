public class KnapSack {

    static int knapsack(int W, int[] val, int[] wt) {
        int n = wt.length;
        int[][] dp = new int[n + 1][W + 1];

        // Build DP table
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {

                // Base case
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } 
                else {
                    int pick = 0;

                    // Pick the item if weight allows
                    if (wt[i - 1] <= j) {
                        pick = val[i - 1] + dp[i - 1][j - wt[i - 1]];
                    }

                    // Do not pick the item
                    int notPick = dp[i - 1][j];

                    dp[i][j] = Math.max(pick, notPick);
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int W = 5;
        int[] wt = {1, 2, 3};
        int[] val = {2, 4, 5};

        int result = knapsack(W, val, wt);
        System.out.println("Maximum value in Knapsack = " + result);
    }
}
