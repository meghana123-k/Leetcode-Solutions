class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num : nums) {
            xor ^= num;
        }
        xor = ((xor & (xor-1)) ^ xor);
        int bx1 = 0;
        int bx2 = 0;
        for(int num : nums) {
            if((num & xor) != 0) {
                bx1 ^= num;
            } else {
                bx2 ^= num;
            }
        }
        return new int[]{bx1, bx2};
    }
}