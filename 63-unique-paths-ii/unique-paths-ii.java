class Solution {
    int[][] dp;
    public int helper(int[][] grid, int n, int m) {
        if(n == 0 || m == 0) return 1;
        // if(n < 0 || m < 0) return 0;
        // if(grid[m][0] == 1 || grid[0][n] == 1) return 0;
        if(dp[n][m] != -1) return dp[n][m];
        int up = 0, left = 0;
        if(grid[n-1][m] != 1)  {
            up = helper(grid, n-1, m);
        }
        if(grid[n][m-1] != 1) {
            left = helper(grid, n, m-1);
        }
        return dp[n][m] = up + left;
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        dp = new int[n][m];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int i = 0;
        while(i < n) {
            if(grid[i][0] == 1) {
                break;
            }
            i++;
        }
        while(i < n) {
            grid[i][0] = 1;
            i++;
        }
        
        int j = 0;
        while(j < m) {
            if(grid[0][j] == 1) {
                break;
            }
            j++;
        }
        while(j < m) {
            grid[0][j] = 1;
            j++;
        }
        if(grid[0][0] == 1 || grid[n-1][m-1] == 1) return 0;
        return helper(grid, n-1, m-1);
    }
}