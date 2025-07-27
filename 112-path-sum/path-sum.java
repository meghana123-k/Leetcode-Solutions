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
    public boolean hasPathSum(TreeNode root, int tsum) {
        if(root == null) return false;
        sum += root.val;
        System.out.print(sum+" ");
        if(root.left == null && root.right == null) {
            boolean isTarg = (sum == tsum);
            sum -= root.val;
            return isTarg;
        }
        boolean left = hasPathSum(root.left, tsum);
        boolean right = hasPathSum(root.right, tsum);
        sum -= root.val;
        return left || right;
    }
}