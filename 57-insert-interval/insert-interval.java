class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> a = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++) {
            a.add(new int[]{intervals[i][0], intervals[i][1]});
        }
        a.add(newInterval);
        Collections.sort(a, (a1, b1) -> Integer.compare(a1[0], b1[0]));
        int t[] = new int[2];
        t[0] = a.get(0)[0];
        t[1] = a.get(0)[1];
        int n = a.size();
        ArrayList<int[]> res = new ArrayList<>();

        for(int i = 1; i < n; i++) {
            if(a.get(i)[0] <= t[1]) {
                t[1] = Math.max(t[1], a.get(i)[1]);
            } else {
                res.add(t);
                t = a.get(i);
            }
        }
        res.add(t);
        return res.toArray(new int[res.size()][]);
    }
}