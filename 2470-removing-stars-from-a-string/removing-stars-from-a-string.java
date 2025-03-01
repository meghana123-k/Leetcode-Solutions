class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        stk.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == '*') {
                stk.pop();
            } else {
                stk.push(s.charAt(i));
            }
        }
        String str = "";
        while(!stk.isEmpty()) {
            char top = stk.pop();
            str = top + str;
        }
        return str;
    }
}