class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));
        pq.addAll(map.entrySet());

        int res[] = new int[k];
        int i = 0;
        while(k-- > 0) {
            Map.Entry<Integer, Integer> ele = pq.poll();
            res[i++] = ele.getKey();
        }
        return res;
    }
}