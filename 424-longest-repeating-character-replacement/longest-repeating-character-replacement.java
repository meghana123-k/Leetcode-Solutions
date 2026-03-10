class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int ans = 0;
        int maxFreq = 0;
        for(int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            int wSize = right - left + 1;
            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));
            if(wSize - maxFreq <= k) {
                ans = Math.max(wSize, ans);
            } else {
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }
        }
        return ans;
    }
}