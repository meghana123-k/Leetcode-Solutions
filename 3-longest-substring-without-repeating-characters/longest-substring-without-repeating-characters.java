class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int ans = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        for(int j = 0; j < s.length(); j++) {
            while(map.containsKey(s.charAt(j))) {
                map.remove(s.charAt(i));
                i++;
            }
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            ans = Math.max(ans, j - i + 1);
        }
        return ans == Integer.MIN_VALUE ? 0 : ans;
    }
}