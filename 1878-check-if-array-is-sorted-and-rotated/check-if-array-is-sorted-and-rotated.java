class Solution {
    public boolean checkSorted(int[] a, int n) {
        for(int i = 0; i < n-1; i++) {    
            if(a[i] > a[i+1]) {
                return false;
            }
        }
        return true;
    }
    public boolean check(int[] nums) {
        int n = nums.length;
        for(int k = 0; k < n; k++) {
            int temp = nums[0];
            // int sorted[] = new int[n];
            for(int i = 0; i < n-1; i++) {
                nums[i] = nums[i+1];
            }
            nums[n-1] = temp;
            if(checkSorted(nums, n)) {
                return true;
            }
        }
        return false;
    }
}