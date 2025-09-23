class Solution {
    public int minPathSum(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[][] dp = new int[n][m];
        dp[0][0] = a[0][0];
        for(int i = 1; i < n; i++) { dp[i][0] = dp[i-1][0] + a[i][0]; }
        for(int i = 1; i < m; i++) { dp[0][i] = dp[0][i-1] + a[0][i]; }
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                int min1 = Integer.MAX_VALUE;
                int min2 = Integer.MAX_VALUE;
                if(i-1 >= 0) {  min1 = dp[i-1][j]; }
                if(j-1 >= 0) {  min2 = dp[i][j-1]; }
                dp[i][j] = a[i][j] + Math.min(min1, min2);
            }
        }
        return dp[n-1][m-1];
    }
}