class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int cnt = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(k == 0) {
                if(entry.getValue() >= 2) {
                    cnt++;
                }
            } else {
                if(map.containsKey(entry.getKey() + k)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}