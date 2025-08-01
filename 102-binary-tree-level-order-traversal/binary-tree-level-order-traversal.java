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
        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        que.add(root);
        while(!que.isEmpty()) {
            int size = que.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode node = que.poll();
                temp.add(node.val);
                if(node.left != null) {
                    que.add(node.left);
                }
                if(node.right != null) {
                    que.add(node.right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}