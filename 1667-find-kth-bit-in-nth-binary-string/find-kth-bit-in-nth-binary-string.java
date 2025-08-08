class Solution {
    private static String comp(String s) {
        StringBuilder res = new StringBuilder();
        for(char c: s.toCharArray()) {
            if(c == '0') res.append("1");
            else res.append("0");
        }
        return res.reverse().toString();
    }
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("0");
        for(int i = 1; i < n; i++) {
            // for(char c : sb.toString().toCharArray()) {
            //     if(c == '0') {
                    String s = comp(sb.toString());
                    sb.append('1').append(s);
                // }
            // }
        }
        return sb.charAt(k-1);
    }
}