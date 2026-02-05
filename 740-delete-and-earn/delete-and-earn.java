class Solution {
    
    public int helper(int[] a, int x) {
        if(x >= a.length) return 0;
        
        int take = a[x]*x + helper(a, x+2);
        int notTake = helper(a, x+1);
        return Math.max(take, notTake);
    }
    public int deleteAndEarn(int[] nums) {
        if(nums.length == 1) return nums[0];
        int n = 0;
        for(int num : nums) {
            n = Math.max(n, num);
        }
        int a[] = new int[n+1];
        for(int i = 0; i < nums.length; i++) {
            a[nums[i]]++;
        }
        int[] dp = new int[a.length+1];
        dp[0] = a[0];
        dp[1] = a[1];
        for(int i = 2; i < a.length; i++) {
            int take = dp[i-2] + a[i]*i;
            int notTake = dp[i-1];
            dp[i] = Math.max(take, notTake);
        }
        return dp[n];
    }
}