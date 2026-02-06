class Solution {
    int[] dp;
    int helper(int[] a, int idx) {
        if(idx == a.length-1) return 1;
        if(a[idx] == 0) return 0;
        if(dp[idx] != -1) return dp[idx];
        int des = idx + a[idx];
        for(int j = idx + 1; j <= des; j++) {
            if(j < a.length && helper(a, j) == 1) {
                return dp[idx] = 1;
            }
        }
        return dp[idx] = 0;
    }
    public boolean canJump(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        return helper(nums, 0) == 1 ? true : false;
    }
}