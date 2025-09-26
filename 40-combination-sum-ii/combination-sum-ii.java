class Solution {
    public void combSum(int[] a, int idx, int k, List<List<Integer>> res, List<Integer> ar) {

        if(k == 0) {
            res.add(new ArrayList<>(ar));
            return;
        }
        for(int i = idx; i < a.length; i++) {
            if(i > idx && a[i] == a[i-1]) continue;
            if(a[i] > k) break;
            ar.add(a[i]);
            combSum(a, i + 1, k-a[i], res, ar);
            ar.remove(ar.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] a, int k) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(a);
        combSum(a, 0, k, res, new ArrayList<>());
        return res;
    }
}