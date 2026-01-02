class Solution {
    public int[] searchRange(int[] a, int t) {
        int n = a.length;
        if(n == 0) return new int[] {-1, -1};
        int res[] = new int[2];
        res[0] = search(a, t, true);
        res[1] = search(a, t, false);
        return res;
        
    }
    public int search(int[] a, int t, boolean flag) {
        int l = 0, r = a.length-1;
        int idx = -1;
        while(l <= r) {
            int mid = l + (r-l)/2;
            if(a[mid] == t) {
                idx = mid;
                if(flag) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            else if(t < a[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return idx;
    }
}