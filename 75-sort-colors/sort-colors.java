class Solution {
    public void sortColors(int[] nums) {
        int c1 = 0, c2 = 0, c3 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) c1++;
            else if(nums[i] == 1) c2++;
            else c3++;
        }
        int i = 0;
        while(c1-- > 0) {
            nums[i++] = 0;
        }
        while(c2-- > 0) {
            nums[i++] = 1;
        }
        while(c3-- > 0) {
            nums[i++] = 2;
        }
    }
}