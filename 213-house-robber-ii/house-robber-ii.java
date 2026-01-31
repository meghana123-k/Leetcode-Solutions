class Solution {
    int[] dp;
    int helper(int[] nums, int idx, int len) {
        if(idx >= len) return 0; 
        if(dp[idx] != -1) return dp[idx];
        int take = nums[idx] + helper(nums, idx + 2, len);
        int notTake = helper(nums, idx + 1, len);
        return dp[idx] = Math.max(take, notTake);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        if(n == 1) return nums[0];
        int r1 = helper(nums, 0, n-1);
        Arrays.fill(dp, -1);
        int r2 = helper(nums, 1, n);
        return Math.max(r1, r2);
    }
}