class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int cnt = 0;
        int left = 0, right = 0;
        int prod = 1;
        while(right < nums.length) {
            prod *= nums[right];
            if(prod >= k) {
                while(left < nums.length && prod >= k) {
                    // cnt++;
                    prod /= nums[left];
                    left++;
                }
                if(prod < k) {
                    cnt += (right - left + 1);
                }
            } else {
                cnt += (right - left + 1);
            }
            right++;
        }
        return cnt;
    }
}