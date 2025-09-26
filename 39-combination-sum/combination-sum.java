class Solution {
    public void combSum(int[] a, int idx, int k, List<List<Integer>> res, List<Integer> ar) {
        // if(idx == a.length) {
        //     if(k == 0) {
        //         res.add(new ArrayList<>(ar));
        //     }
        //     return;
        // }
        // if(a[idx] <= k) {
        //     ar.add(a[idx]);
        //     combSum(a, idx, k-a[idx], res, ar);
        //     ar.remove(ar.size() - 1);
        // }
        // combSum(a, idx + 1, k, res, ar);
        if(idx < 0) return ;
        if(k == 0) {
            res.add(new ArrayList<>(ar));
            return;
        }
        combSum(a, idx-1, k, res, ar);
        if(a[idx] <= k) {
            ar.add(a[idx]);
            combSum(a, idx, k - a[idx], res, ar);
            ar.remove(ar.size()-1);
        }
       
    }
    public List<List<Integer>> combinationSum(int[] a, int k) {
         List<List<Integer>> res = new ArrayList<>();

        combSum(a, a.length-1, k, res, new ArrayList<>());
        return res;
    }
}