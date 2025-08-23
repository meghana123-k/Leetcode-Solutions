class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int c = (1<<n);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < c; i++) {
            List<Integer> res = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                if(checkBits(i, j)) {
                    res.add(nums[j]);
                }
            }
            result.add(res);
        }
        return result;
    }
    private boolean checkBits(int n, int pos) {
        return ((n & (1 << pos)) != 0);
    }
}