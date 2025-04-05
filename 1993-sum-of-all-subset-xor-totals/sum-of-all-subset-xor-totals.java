class Solution {
    public int subsetXORSum(int[] nums) {
        int sum = 0, xor = 0;
        int n = nums.length;
        int total = (1 << n);
        for(int mask = 0; mask < total; mask++) {
            xor = 0;
            for(int i = 0; i < n; i++) {
                if((mask & (1 << i)) != 0) {
                    xor ^= nums[i];
                }
            }
            sum += xor;
        }
        return sum;
    }
}