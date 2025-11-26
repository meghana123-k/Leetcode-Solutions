class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = 0;
        for(int i = 0; i < n; i++) {
            int p1 = i, p2 = i;
            while(p1 >= 0 && p2 < n && s.charAt(p1) == s.charAt(p2)) {
                p1--;
                p2++;
            }
            int len1 = p2-p1-1;
            p1 = i;
            p2 = i+1;
            while(p1 >= 0 && p2 < n && s.charAt(p1) == s.charAt(p2)) {
                p1--;
                p2++;
            }
            int len2 = p2-p1-1;
            int max = Math.max(len1, len2);
            if(max > end - start) {
                start = i - (max - 1) / 2;
                end = i + max / 2;
            }
        }
        return s.substring(start, end+1);
    }
}