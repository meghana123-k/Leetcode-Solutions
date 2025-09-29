class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) {
            pq.add(num);
        }
        int n = nums.length;
        int[] res = new int[n];
        int k = 0;
        while(!pq.isEmpty()) {
            res[k++] = pq.remove();
        }
        return res;
    }
}