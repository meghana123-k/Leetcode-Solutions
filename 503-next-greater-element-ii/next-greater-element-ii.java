class Solution {
    public int[] nextGreaterElements(int[] a) {
        int[] nums = new int[a.length];
        Arrays.fill(nums, -1);
        Deque<Integer> stk = new ArrayDeque<>();
        for(int i = 0; i < 2 * a.length; i++) {
            int idx = i % a.length;
            while(!stk.isEmpty() && a[idx] > a[stk.peek()]) {
                nums[stk.pop()] = a[idx];
            }
            if(i < a.length) {
                stk.push(idx);
            }
        }
        return nums;
    }
}