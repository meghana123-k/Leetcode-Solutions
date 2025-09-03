class Solution {
    private int noSetBits(int a)
    {
        int c= 0;
        while(a!=0)
        {
            c++;
            a = a&(a-1);
        }
        return c;
    }
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            res[i] = arr[i] + (noSetBits(arr[i]) * 10001);
        }
        Arrays.sort(res);
        for(int i = 0; i < n; i++) {
            res[i] %= 10001;
        }
        return res;
    }
}