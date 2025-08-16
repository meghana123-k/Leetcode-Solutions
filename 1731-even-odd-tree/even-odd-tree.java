/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean sortOrder(int level, ArrayList<Integer> ar) {
        if(level % 2 == 0) {
            if(ar.get(0) % 2 == 0) return false; 
            for(int i = 1; i < ar.size(); i++) {
                if(ar.get(i) % 2 == 0) return false; 
                if(ar.get(i-1) >= ar.get(i)) return false;
            }
        } else {
            if(ar.get(0) % 2 != 0) return false; 
            for(int i = 1; i < ar.size(); i++) {
                if(ar.get(i) % 2 != 0) return false; 
                if(ar.get(i-1) <= ar.get(i)) return false;
            }
        }
        return true;
    }
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        if(root.val % 2 == 0) return false;
        int level = 0;
        boolean res = true;
        while(!que.isEmpty()) {
            int n = que.size();
            ArrayList<Integer> ln = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                TreeNode front = que.poll();
                System.out.print(front.val+" ");
                ln.add(front.val);
                if(front.left != null) {
                    que.add(front.left);
                }
                if(front.right != null) {
                    que.add(front.right);
                }
            }
            if(!sortOrder(level, ln)) return false;
            level++;
        }
        return res;
    }
}