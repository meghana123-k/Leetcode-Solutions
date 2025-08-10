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
    int min = Integer.MAX_VALUE;
    TreeNode prev = null;
    private void left(TreeNode root) {
        if(root == null) return ;
        left(root.left);
        if(prev != null) {
            min = Math.min(min, Math.abs(root.val - prev.val));
        }
        prev = root;
        System.out.print(root.val+" ");
        left(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        left(root);
        return min;
    }
}