class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        int j = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == ' ' || i == 0) {
                if(i != 0) {
                    sb.append(s.substring(i+1, j)).append(" ");
                } else {
                    sb.append(s.substring(i, j));
                }
                j = i;
            }
        }
        
        return sb.toString().trim();
    }
}