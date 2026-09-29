class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        System.out.println(n+" "+m);
        if(n < m) return "";
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for(char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int formed = 0;
        int required = need.size();
        System.out.println(formed+" "+required);
        int l = 0, r = 0;
        int min = n;
        int start = 0, end = n;
        boolean found = false;
        while(r < n) {
            char currR = s.charAt(r);
            if(need.containsKey(currR)) {
                window.put(currR, window.getOrDefault(currR, 0) + 1);
                if(need.get(currR).equals(window.get(currR))) {
                    formed++;
                }
            }
            while(l < n && formed == required) {
                char currL = s.charAt(l);
                int len = r - l + 1;
                if(min >= len) {
                    found = true;
                    min = len;
                    start = l;
                    end = r;
                }
                if(need.containsKey(currL)) {
                    window.put(currL, window.get(currL) - 1);
                    if(window.get(currL) < need.get(currL)) {
                        formed--;
                    }
                    if(window.get(currL) == 0) {
                        window.remove(currL);
                    }
                }
                l++;
            }
            r++;
        }
        System.out.println(min);
        return found ? s.substring(start, end+1) : "";
    }
}