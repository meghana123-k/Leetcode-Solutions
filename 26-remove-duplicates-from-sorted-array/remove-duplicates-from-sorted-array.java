class Solution {
    public int removeDuplicates(int[] a) {
        int n = a.length;
        int j = 0, k = 0;
        int i = 0;
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