class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for(char ch : s1.toCharArray()) {
            f1[ch - 'a']++;
        }
        int req = s1.length();
        for(int right = 0; right < s2.length(); right++) {
            char ch = s2.charAt(right);
            f2[ch - 'a']++;
            if(right >= req) {
                f2[s2.charAt(right-req)-'a']--;
            }
            if(Arrays.equals(f1, f2)) return true;
        }
        return false;
    }
}