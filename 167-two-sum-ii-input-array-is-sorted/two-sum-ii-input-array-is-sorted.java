class Solution {
    public int[] twoSum(int[] a, int k) {
        int p1 = 0, p2 = a.length-1;
        while(p1 <= p2) {
            int sum = a[p1]+a[p2];
            if(sum == k) {
                return new int[] {p1+1, p2+1};
            } else if(sum < k) {
                p1++;
            } else {
                p2--;
            }
        }
        return new int[2];
    }
}