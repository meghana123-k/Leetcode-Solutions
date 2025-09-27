class Solution {
    private int helper(String s, String t, int n, int m, int[][] dp) {
        if(m < 0) return 1;
        if(n < 0) return 0;

        if(dp[n][m] != -1) return dp[n][m];
        int match = 0;
        if(s.charAt(n) == t.charAt(m)) {
            match = helper(s, t, n-1, m-1, dp);
        } 
        int misMatch = helper(s, t, n-1, m, dp);
        return dp[n][m] = match + misMatch;
    }
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i++) { Arrays.fill(dp[i], -1); }
        return helper(s, t, s.length()-1, t.length()-1, dp);
    }
}