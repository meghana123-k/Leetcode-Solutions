class Solution {
    public int minBitFlips(int start, int goal) {
        int mask = start ^ goal;
        int cnt = 0;
        while(mask != 0) {
            mask = mask & (mask - 1);
            cnt++;
        }
        return cnt;
    }
}