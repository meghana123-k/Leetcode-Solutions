class Solution {
    long[] dp;
    public long helper(int[] a, int amt) {
        if(amt == 0) return 0;
        // if(amt < 0) return 0;
        if(dp[amt] != -1) return dp[amt];
        long min = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++) {
            if(a[i] <= amt) {
                min = Math.min(1 + helper(a, amt - a[i]), min);
            }
        }
        return dp[amt] = min;
    }
    public int coinChange(int[] coins, int amount) {
        dp = new long[amount+1];
        Arrays.fill(dp, -1);
        long ans = helper(coins, amount);

        return (ans == Integer.MIN_VALUE || ans == Integer.MAX_VALUE) ? -1 : (int)ans;
    }
}