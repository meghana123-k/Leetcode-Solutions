class Solution {
    public boolean canSortArray(int[] a) {
        int max = a[0], lastMax = 0, bits = countBits(a[0]);
        for(int i = 1; i < a.length; i++) {
            boolean bit = bits!= countBits(a[i]);
            if(bit) lastMax = max;
            if(a[i] > max) {
                max = a[i];
                bits  = countBits(max);
            }
            if(a[i] < lastMax) return false;
        } 
        return true;
    }
    private int countBits(int n) {
        int count = 0;
        while(n > 0) {
            count += (n&1);
            n = n >> 1;
        }
        return count;
    }
}