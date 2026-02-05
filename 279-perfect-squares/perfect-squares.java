class Solution {
    int[] dp;
    public int helper(int n) {
        if(n == 0) return 0;
        if(n < 0) return 0;
        if(dp[n] != -1) return dp[n];
        int min = Integer.MAX_VALUE;
        for(int  k = 1; k*k <= n; k++) {
            min = Math.min(1 + helper(n - k*k), min);
        }
        return dp[n] = min;
    }
    public int numSquares(int n) {
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(n);
    }
}