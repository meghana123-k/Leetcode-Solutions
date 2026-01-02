class Solution {
    public int repeatedNTimes(int[] nums) {
        int len = nums.length;
        int n = len / 2;
        Map<Integer, Integer> fre = new HashMap<>();
        for(int num : nums) {
            fre.put(num, fre.getOrDefault(num, 0) + 1);
        }
        for(int key : fre.keySet()) {
            if(fre.get(key) == n) {
                return key;
            }
        }
        return 0;
    }
}