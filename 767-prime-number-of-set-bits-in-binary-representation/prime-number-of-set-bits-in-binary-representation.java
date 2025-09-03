class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++) {
            int c = countSetBits(i);
            if(isPrime(c)) {
                count++;
            }
        }
        return count;
    }
    private boolean isPrime(int n) {
        List<Integer> lst = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
        HashSet<Integer> set = new HashSet<>();
        set.addAll(lst);
        return set.contains(n);
    }
    private int countSetBits(int n) {
        int c = 0;
        while(n != 0) {
            c++;
            n = n & (n-1);
        }
        return c;
    }
}