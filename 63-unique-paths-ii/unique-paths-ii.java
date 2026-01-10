class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if(grid[0][0] == 1 || grid[n-1][m-1] == 1) return 0;
        if(n == 0 || m == 0) return 0;
        // if(n == 1 || m == 1) return 1;
        int[][] dp = new int[n][m];

        int i = 0;
        while(i < n) {
            if(grid[i][0] == 1) break;
            dp[i][0] = 1;
            i++;
        }
        int j = 0;
        while(j < m) {
            if(grid[0][j] == 1) break;
            dp[0][j] = 1;
            j++;
        }
        while(i < n) {
            grid[i][0] = -1;
            i++;
        }
        while(j < m) {
            grid[0][j] = -1;
            j++;
        }
        for(int k = 1; k < n; k++) {
            for(int l = 1; l < m; l++) {
                if(grid[k][l] == 1) {
                    dp[k][l] = -1;
                }
            }
        }
        for(int k = 1; k < n; k++) {
            for(int l = 1; l < m; l++) {
                if(dp[k][l] != -1) {
                    int up = 0, down = 0;
                    if(dp[k-1][l] != -1) {
                        up = dp[k-1][l];
                    }
                    if(dp[k][l-1] != -1) {
                        down = dp[k][l-1];
                    }
                    dp[k][l] = up + down;
                    // System.out.println(dp[k-1][l]+" "+dp[k][l-1]);
                }
            }
        }
        return dp[n-1][m-1];
    }
}