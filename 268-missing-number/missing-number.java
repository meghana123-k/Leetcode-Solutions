class Solution {
    public int missingNumber(int[] nums) {
        boolean miss[] = new boolean[nums.length+1];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= nums.length && nums[i] >= 0) {
                miss[nums[i]] = true;
            }
        }
        for(int i = 0; i < miss.length; i++) {
            if(!miss[i]) {
                return i;
            }
        }
        return 0;
    }
}