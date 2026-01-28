class Solution {
    public int helper(int[] a, int idx) {
        if(idx < 0) return 0;

        int take = helper(a, idx - 2) + a[idx];
        int notTake = helper(a, idx - 1);
        return Math.max(take, notTake);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 1; i < n; i++) {
            int notTake = dp[i];
            int take = nums[i] + dp[i-1];
            dp[i+1] = Math.max(take, notTake);
        }
        return dp[n];
        // return helper(nums, nums.length-1);
    }
}