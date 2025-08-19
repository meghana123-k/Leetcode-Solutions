class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean b[] = new boolean[nums.length+2];
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0 && nums[i] <= nums.length) {
                b[nums[i]] = true;
            }
        }
        for(int i = 1; i < b.length; i++) {
            if(b[i] == false) return i;
        }
        return j;
    }
}