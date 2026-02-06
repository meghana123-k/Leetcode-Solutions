class Solution {
    int[] dp;
    int help(int[] a, int i) {
        if(i == a.length-1) return 0;
        if(a[i] == 0) return Integer.MAX_VALUE;
        if(dp[i] != -1) return dp[i];
        int des = i + a[i];
        int min = Integer.MAX_VALUE;
        int take = 0;
        for(int j = i + 1; j <= des; j++) {
            if(j < a.length) {
                int next = help(a, j);
                if(next != Integer.MAX_VALUE) {
                    min = Math.min(1 + next, min);
                }
            }
        }
        return dp[i] = min;
    }
    public int jump(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        dp = new int[n];
        Arrays.fill(dp, -1);
        int ans = help(nums, 0);
        return ans;
    }
}