class Solution {
    public boolean isPalindrome(String s) {
        int p1 = 0, p2 = s.length()-1;
        while(p1 <= p2) {
            if(s.charAt(p1) != s.charAt(p2)) return false;
            p1++;
            p2--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        if(isPalindrome(s)) return true;
        int p1 = 0, p2 = s.length()-1;
        while(p1 < p2) {
            if(s.charAt(p1) != s.charAt(p2)) {
                String sub1 = s.substring(p1, p2);
                String sub2 = s.substring(p1+1, p2+1);
                System.out.println(sub1+" "+sub2);
                boolean r1 = isPalindrome(sub1);
                boolean r2 = isPalindrome(sub2);
                if(r1 || r2) return true;
                if(!r1 && !r2) return false;
            }
            p1++;
            p2--;
        }
        return false;
    }
}