class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m[] = new int[26];
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : ransomNote.toCharArray()) {
            map.put(ch, map.getOrDefault(ch ,0) +1);
        }
        for(char ch : magazine.toCharArray()) {
            m[ch - 97]++;
        }
        for(char key: map.keySet()) {
            int idx = key - 97;
            if(m[idx] < map.get(key)) {
                return false;
            }
        }
         return true;

    }
}