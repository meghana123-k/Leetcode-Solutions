class Solution {
    public String reverseOnlyLetters(String s) {
        char[] st = s.toCharArray();
        int p1 = 0, p2 = s.length()-1;
        
        while(p1 <= p2) {
            if(Character.isAlphabetic(st[p1]) && Character.isAlphabetic(st[p2])) {
                char temp = st[p1];
                st[p1] = st[p2];
                st[p2] = temp;
                p1++;
                p2--;
            } else  if(!Character.isAlphabetic(st[p1])) {
                p1++;
            } else if(!Character.isAlphabetic(st[p2])) {
                p2--;
            } else {
                p1++;
                p2--;
            }
        }
        return String.copyValueOf(st);
    }
}