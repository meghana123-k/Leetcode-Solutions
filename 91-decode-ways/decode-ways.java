class Solution {
    int[] dp;
    int help(String s, int idx) {
        if(idx == s.length()) return 1;
        if(s.charAt(idx) == '0') return 0;
        if(dp[idx] != -1) return dp[idx];
        int take1 = take1 = help(s, idx + 1);
        int take2 = 0;
        if(idx+1 < s.length()) {
            int sub = Integer.parseInt(s.substring(idx, idx+2));
            System.out.print(sub+" ");
            if(sub >= 10 && sub <= 26) {
                take2 = help(s, idx + 2);
            }
        }
        return dp[idx] = (take1 + take2);
    }
    public int numDecodings(String s) {
        int n = s.length();
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return help(s, 0);
    }
}