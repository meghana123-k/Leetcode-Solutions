class Solution {
    List<String> ds; 
    private void helper(int len, String res, int c1, int c2) {
        if(c1 == len) {
            // System.out.println(c2);
            for(int i = c2; i < len; i++) {
                res += ")";
            }
            ds.add(res);
            return;
        }
        helper(len, res + "(", c1+1, c2);
        if(c1 != c2) {
            helper(len, res + ")", c1, c2+1);
        }
    }
    public List<String> generateParenthesis(int n) {
        ds = new ArrayList<>();
        helper(n, "", 0, 0);
        return ds;
    }
}