
class Solution {
    public int reverse(int x) {
        if(x == 0) {
            return 0;
        }
        boolean neg = x < 0;
        int x1 = Math.abs(x);
        String st = String.valueOf(x1);
        StringBuilder sb = new StringBuilder(st);
        sb.reverse();

        while(sb.charAt(0) == '0' && sb.length() >= 0) {
            sb.deleteCharAt(0);
        } 
        if(neg) {
            sb.insert(0, '-');
        }
        String s = sb.toString();
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0; // Return 0 if overflow occurs
        }

    }
}