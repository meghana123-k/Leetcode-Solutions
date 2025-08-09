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
    private int height(TreeNode root) {
        if(root == null) return 0;
        return Math.max(height(root.left), height(root.right))+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int l = height(root.left);
        int r = height(root.right);
        int height = Math.abs(l-r);
        if(height > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}