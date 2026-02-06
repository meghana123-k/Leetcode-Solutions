class Solution {
    public boolean helper(int[] a, int i, int sum, int tar) {
        if(i >= a.length) return false;
        if(sum == tar) return true;
        boolean take = helper(a, i+1, sum - a[i], tar);
        boolean notTake = helper(a, i+1, sum, tar);
        return take || notTake;
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        if(sum % 2 != 0) return false;
        int target = sum / 2;
        boolean[][] dp = new boolean[n+1][target+1];
        for(int i = 1; i <= n; i++) {
            dp[i][0] = true;
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= target; j++) {
                boolean notTake = dp[i-1][j];
                boolean take = false;
                if(j - nums[i-1] >= 0) {
                    take = dp[i-1][j - nums[i-1]];
                }
                dp[i][j] = take || notTake;
            }
        }
        return dp[n][target];
        // return helper(nums, 0, sum, sum/2);
    }
}