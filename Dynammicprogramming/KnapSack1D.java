public class KnapSack1D {

    static int knapsack(int W, int[] val, int[] wt) {
        int n = wt.length;
        int[] dp = new int[W + 1];

        // Process each item
        for (int i = 0; i < n; i++) {

            // Traverse capacity backwards
            for (int w = W; w >= wt[i]; w--) {
                dp[w] = Math.max(dp[w], val[i] + dp[w - wt[i]]);
            }
        }
        return dp[W];
    }

    public static void main(String[] args) {
        int W = 5;
        int[] wt = {1, 2, 3};
        int[] val = {2, 4, 5};

        int result = knapsack(W, val, wt);
        System.out.println("Maximum value in Knapsack = " + result);
    }
}
