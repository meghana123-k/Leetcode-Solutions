class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        while(low <= high) {
            String s = String.valueOf(low);
            if(s.length() % 2 == 0) {
                int a[] = divide(low);
                if(isSymmetric(a)) {
                    System.out.print(low+" ");
                    count++;
                }
            }
            low++;
        }
        return count;
    }
    public static int[] divide(int low) {
        String s = String.valueOf(low);
        // System.out.print(s+" ");
        int a[] = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i) - '0';
        }
        return a;
    }
    public static boolean isSymmetric(int a[]) {
        int n = a.length;
        int s1 = 0, s2 = 0;
        for(int i = 0; i < n/2; i++) {
            s1 += a[i];
        }
        for(int i = n/2; i < n; i++) {
            s2 += a[i];
        }

        return s1 == s2;
    }
}