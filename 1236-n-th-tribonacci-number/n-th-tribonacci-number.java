class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;
        int f = 0, s = 1, t = 1;
        for(int i = 3; i <= n; i++) {
            int temp1 = t;
            int temp2 = s;
            t = t + f + s;
            s = temp1;
            f = temp2;
        }
        return t;
    }
}