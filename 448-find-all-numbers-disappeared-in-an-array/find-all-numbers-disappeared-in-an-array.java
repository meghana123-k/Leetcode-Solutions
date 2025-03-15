class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean vis[] = new boolean[nums.length+1];
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= nums.length && nums[i] > 0) {
                vis[nums[i]] = true;
            }
        }
        for(int i = 1; i < vis.length; i++) {
            if(!vis[i]) {
                res.add(i);
            }
        }
        return res;
    }
}