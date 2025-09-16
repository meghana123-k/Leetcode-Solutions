class Solution {
    public int[] findOrder(int num, int[][] pre) {
        int in[] = new int[num];
        List<List<Integer>> g = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            g.add(i, new ArrayList<>());
        }
        for(int[] u : pre) {
            g.get(u[1]).add(u[0]);
            in[u[0]]++;
        }

        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < num; i++) {
            if(in[i] == 0) que.add(i);
        }
        int[] ans = new int[num];
        int idx = 0;
        while(!que.isEmpty()) {
            int v = que.poll();
            ans[idx++] = v;
            for(int u : g.get(v)) {
                in[u]--;
                if(in[u] == 0) {
                    que.add(u);
                }
            }
        }
        return idx != num ? new int[]{} : ans;
    }
}