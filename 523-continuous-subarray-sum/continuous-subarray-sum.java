class Solution {
    public boolean checkSubarraySum(int[] a, int k) {
        int n = a.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int pf = 0;
        for(int i = 0; i < n; i++) {
            pf = (pf + a[i]) % k;
            if(!map.containsKey(pf)) {
                map.put(pf, i);
            } else if(i - map.get(pf) >= 2) {
                return true;
            }
        }
        return false;
    }
}