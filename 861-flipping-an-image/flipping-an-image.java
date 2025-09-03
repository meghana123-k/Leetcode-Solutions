class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] a : image) {
            int start = 0, end = a.length-1;
            while(start < end) {
                int temp = a[start] ^ 1;
                a[start] = a[end] ^ 1;
                a[end] = temp;
                start++;
                end--;
            }
            if(start == end) {
                a[start] ^= 1;
            }
        }
        return image;
    }
}