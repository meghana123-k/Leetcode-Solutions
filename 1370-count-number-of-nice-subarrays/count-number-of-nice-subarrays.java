class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0, sum  = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] % 2 != 0) {
                sum += 1;
            }
            if(map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}