class Solution {
    int dp[][];
    private int helper(String s1, String s2, int n, int m) {
        if(n < 0 || m < 0) return 0;
        if(n == 0 && m == 0) return 0;
        if(n == 0) return m;
        if(m == 0) return n;
        if(dp[n][m] != -1) return dp[n][m];
        if(s1.charAt(n-1) == s2.charAt(m-1)) {
            return dp[n][m] = helper(s1, s2, n-1, m-1);
        } else {
            int insert = helper(s1, s2, n, m-1);
            int delete = helper(s1, s2, n-1, m);
            int replace = helper(s1, s2, n-1, m-1);
            return dp[n][m] = 1 + Math.min(insert, Math.min(delete, replace));
        }
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        dp =  new int[n+1][m+1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(word1, word2, n, m);
    }
}