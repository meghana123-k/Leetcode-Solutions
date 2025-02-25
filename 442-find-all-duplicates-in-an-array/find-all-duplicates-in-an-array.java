class Solution {
    public List<Integer> findDuplicates(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        int n = a.length;
        List<Integer> ar = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(set.contains(a[i])) {
                ar.add(a[i]);
            }
            set.add(a[i]);
        }
        return ar;
    }
}