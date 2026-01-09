class Solution {
    public int removeDuplicates(int[] a) {
        int k = 0; 
        int n = a.length;
        int i = 0, j = 0;
        while(i < n) {
            a[k++] = a[i];
            while(i < n && a[i] == a[j]) {
                i++;
            }
            j = i;
        }
        return k;
    }
}