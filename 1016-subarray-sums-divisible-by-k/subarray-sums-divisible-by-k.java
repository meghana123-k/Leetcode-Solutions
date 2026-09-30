class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0, pf = 0;
        for(int i = 0; i < n; i++) {
            pf += nums[i];
            int rem = ((pf % k) + k) % k;
            System.out.println(pf);
            if(map.containsKey(rem)) {
                ans += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }
        return ans;
    }
}