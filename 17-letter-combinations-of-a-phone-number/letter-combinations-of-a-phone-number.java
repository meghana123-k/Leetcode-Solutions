class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        String inputs[] = new String[4];
        for(int i = 0; i < digits.length(); i++) {
            char ch = digits.charAt(i);
            inputs[i] = map.get(ch);           
        }
        List<String> result = new ArrayList<>();
        result.add("");

        for (String s : inputs) {
            if (s == null) continue;
            List<String> temp = new ArrayList<>();
            for (char c : s.toCharArray()) {
                for (String prefix : result) {
                    temp.add(prefix + c);
                }
            }
            result = temp;
        }
        return result;
    }
}