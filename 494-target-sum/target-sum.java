class Solution {
    public int helper(int[] nums, int sum, int idx) {
        if(idx == nums.length) {
            return sum == 0 ? 1 : 0;
        }
        int notTake = helper(nums, sum, idx + 1);
        int take = 0;
        if(sum >= nums[idx]) {
            take = helper(nums, sum - nums[idx], idx + 1);
        }
        return notTake + take;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        int subsetSum = (sum + target) / 2;
        if(Math.abs(target) > sum) return 0;
        if((sum + target) % 2 != 0) return 0;
        return helper(nums, subsetSum, 0);
    }
}