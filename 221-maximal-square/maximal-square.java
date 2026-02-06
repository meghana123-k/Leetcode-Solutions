class Solution {
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int dp[][] = new int[n][m];
        int ans = 0;
        for(int i = 0; i < n; i++) {
            dp[i][0] = matrix[i][0] -'0';
            ans = Math.max(ans, dp[i][0]);
        }
        for(int i = 0; i < m; i++) {
            dp[0][i] = matrix[0][i] -'0';
            ans = Math.max(ans, dp[0][i]);
        }
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(matrix[i][j] == '1') {
                    dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                }
                System.out.print(dp[i][j]);
                ans = Math.max(dp[i][j], ans);
            }
            System.out.println();
        }
        return ans * ans;
        
    }
}