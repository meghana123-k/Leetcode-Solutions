class Solution {
    int[][] dp;
    public int helper(int[] a, int amt, int j) {
        if(amt == 0) return 1;
        if(dp[amt][j] != -1) return dp[amt][j];
        if(j >= a.length) return 0;
        int cnt = 0;
        if(a[j] <= amt) {
            cnt += helper(a, amt - a[j], j);
            // System.out.println("j = "+j+" "+cnt+" ");
        }
        cnt += helper(a, amt, j + 1);
        return dp[amt][j] = cnt;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        dp = new int[amount+1][n+1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(coins, amount, 0);
    }
}