class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int start = 0, maxi = 0;
        for(int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            while(set.contains(ch)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            maxi = Math.max(maxi, end - start + 1);
        }
        return maxi;
    }
}