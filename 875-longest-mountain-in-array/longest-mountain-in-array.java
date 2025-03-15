class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int ans = 0, i = 0;
        while(i < n) {
            int j = i;
            if(j+1 < n && arr[j] < arr[j+1]) {
                while(j+1 < n && arr[j] < arr[j+1]) j++;
                if(j+1 < n && arr[j] > arr[j+1]) {
                    while(j+1 < n && arr[j] > arr[j+1]) j++;
                    ans = Math.max(ans, j-i+1);
                }
            }
            i = Math.max(j, i+1);
        }
        return ans;
    }
}