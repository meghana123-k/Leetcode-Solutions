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
        boolean[][] dp = new boolean[n+1][sum+1];
        int target = sum / 2;
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= sum; j++) {
                if(j == target) {
                    dp[i][j] = true;
                } else {
                    boolean rem = false;
                    if(j - nums[i-1] >= 0) {
                        rem = dp[i-1][j - nums[i-1]];
                    }
                    dp[i][j] = dp[i-1][j] || rem;
                }
            }
        }
        return dp[n][sum];
        // return helper(nums, 0, sum, sum/2);
    }
}