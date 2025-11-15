class Solution {
    int[][] dp;
    public int LIS(int[] nums, int i, int n, int prev) {
        if(i >= n) return 0;
        if(dp[i][prev+1] != -1) return dp[i][prev+1];
        int take = 0;   
        int notTake = LIS(nums, i+1, n, prev);
        if(prev == -1 || nums[i] > nums[prev]) {
            take = 1 + LIS(nums, i+1, n, i);
        }
        return dp[i][prev+1] = Math.max(take, notTake);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new int[n][n+1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return LIS(nums, 0, n, -1);
    }
}