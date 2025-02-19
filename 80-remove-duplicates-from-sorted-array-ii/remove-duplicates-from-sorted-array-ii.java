class Solution {
    public int removeDuplicates(int[] a) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i])) {
                if(map.get(a[i]) < 2) {
                    map.put(a[i], map.get(a[i])+1);
                }
            }else {
                map.put(a[i], 1);
            }
        }
        int j = 0;
        int cnt = 0;
        for(int key : map.keySet()) {
            int val = map.get(key);
            System.out.println(val);
            while(val-- > 0) {
                a[j++] = key;
                cnt++;
            }
        }
        return cnt;
    }
}