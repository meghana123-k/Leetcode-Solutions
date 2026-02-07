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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        int sum = 0;
        while(!que.isEmpty()) {
            TreeNode front = que.poll();
            if(front.left != null) {
                if(front.left.left == null && front.left.right == null) {
                    sum += front.left.val;
                }
                que.add(front.left);
            }
            if(front.right != null) {
                que.add(front.right);
            }
        }
        return sum;
    }
}