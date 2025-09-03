class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        int[][] res = new int[n][m];
        for(int i = 0; i < n; i++) {
            int k = 0;
            for(int j = m-1; j >= 0; j--) {
                if(image[i][j] == 0) {
                    res[i][k++] = 1;
                } else {
                    res[i][k++] = 0;
                }
            }
        }
        return res;
    }
}