class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int temp = x;
        int rev = 0;
        while(temp != 0) {
            int dig = temp % 10;
            rev = rev * 10 + dig;
            temp /= 10;
        }
        return x == rev;
    }
}