class Solution {
    private void valid(int idx, String str, int n, List<String> res) {
        if(idx == n) {
            if(!str.contains("00")) {
                res.add(str);
            }
            return ;
        }
        str += "0";
        valid(idx+1, str, n, res);
        str = str.substring(0, str.length()-1);
        str += "1";
        valid(idx+1, str, n, res);
        str = str.substring(0, str.length()-1);
    }
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        valid(0, "", n, res);
        return res;
    }
}