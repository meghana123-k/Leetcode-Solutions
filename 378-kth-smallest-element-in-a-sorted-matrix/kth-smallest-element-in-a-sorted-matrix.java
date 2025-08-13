class Solution {
    public int kthSmallest(int[][] a, int k) {
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                map.put(a[i][j], map.getOrDefault(a[i][j], 0) + 1);
            }
        }
        int res = 0;
        for(int key : map.keySet()) {
            if(k > 0) {
                res = key;
                k -= map.get(key);
            }
        }
        return res;
    }
}