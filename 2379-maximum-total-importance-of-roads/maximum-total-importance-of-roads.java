class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long in[] = new long[n];
        for(int[] r : roads) {
            in[r[0]]++;
            in[r[1]]++;
        }
        Arrays.sort(in);
        long sum = 0;
        long val = 1;
        for(long d : in) {
            sum += (d * val);
            val++;
        }
        return sum;
    }
}