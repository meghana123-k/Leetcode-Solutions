class Solution {
    public int[] countBits(int n) {
        int a[] = new int[n+1];
        for(int i = 1; i <= n; i++) {
            a[i] = count(i);
        }
        return a;
    }
    private int count(int n) {
        int cnt = 0;
        while(n != 0) {
            cnt++;
            n = (n & n-1);
        }
        return cnt;
    }
}