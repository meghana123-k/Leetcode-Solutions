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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        List<List<Integer>> res = new ArrayList<>();
        while(!que.isEmpty()) {
            int size = que.size();
            List<Integer> ans = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode front = que.remove();
                if(front.left != null) {
                    que.add(front.left);
                }
                if(front.right != null) {
                    que.add(front.right);
                }
                ans.add(front.val);
            }
            res.add(ans);
        }
        return res;
    }
}