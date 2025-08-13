class Solution {
    private int fun(int[][] a, int m) {
        int ans = 0;
        for(int i = 0; i < a.length; i++) {
            int low = 0, high = a[0].length-1;
            int a1 = 0;
            while(low <= high) {
                int mid = (low + high) / 2;
                if(a[i][mid] < m) {
                    a1 = mid + 1;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
             ans += a1;
        }
        return ans;
    }
    public int kthSmallest(int[][] a, int k) {
        int n = a.length;
        int m = a[0].length;
        int low = a[0][0], high = a[n-1][m-1];
        while(low <= high) {
            int mid = (low + high) / 2;
            int cnt = fun(a, mid);
            System.out.print(cnt+" ");
            if(cnt < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}