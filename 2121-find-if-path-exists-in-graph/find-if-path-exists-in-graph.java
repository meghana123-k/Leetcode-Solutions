class Solution {
    class UDS {
        int p[];
        UDS(int n) {
            p = new int[n];
            for(int i = 0; i < n; i++) { p[i] = i; }
        }
        int find(int x) {
            if(x == p[x]) return x;
            return p[x] = find(p[x]);
        }
        void union(int a, int b) {
            int pa = find(a);
            int pb = find(b);
            p[pa] = pb;
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        UDS ds = new UDS(n);
        for(int[] ed : edges) {
            ds.union(ed[0], ed[1]);
        }
        return ds.find(source) == ds.find(destination);
    }
}