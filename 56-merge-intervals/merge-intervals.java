class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int n = intervals.length;
        ArrayList<int[]> res = new ArrayList<>();
        int[] t = new int[2];
        t[0] = intervals[0][0];
        t[1] = intervals[0][1];
        for(int i = 1; i < n; i++) {
            if(intervals[i][0] <= t[1]) {
                t[1] = Math.max(intervals[i][1], t[1]);
            } else {
                res.add(t);
                t = intervals[i];
            }
        }
        res.add(t);
        int[][] r = new int[res.size()][2];
        for(int i = 0; i < res.size(); i++) {
            r[i][0] = res.get(i)[0];
            r[i][1] = res.get(i)[1];
        }
        return r;
    }
}