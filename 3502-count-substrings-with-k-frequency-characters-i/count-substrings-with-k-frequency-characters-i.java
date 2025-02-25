class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n = s.length();
        int totalCount = 0;

        
        for (int start = 0; start < n; start++) {
            int[] freq = new int[26];   
            int maxFreq = 0;  

            
            for (int end = start; end < n; end++) {
                
                char currentChar = s.charAt(end);
                freq[currentChar - 'a']++;

                maxFreq = Math.max(maxFreq, freq[currentChar - 'a']);

                if (maxFreq >= k) {
                    totalCount += (n - end);  
                    break;   
                }
            }
        }

        return totalCount;
    }
}