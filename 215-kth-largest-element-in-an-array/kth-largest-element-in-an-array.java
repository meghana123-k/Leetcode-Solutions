class Solution {
    public static int[] reverseOrder(int[] nums) {
        int j = 0;
        int[] num = new int[nums.length];
        for(int i = nums.length-1; i >= 0; i--) {
            num[j++] = nums[i];
        }
        return num;
    }
    public int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);
        int[] num = reverseOrder(nums);
        return num[k-1];
    }
}