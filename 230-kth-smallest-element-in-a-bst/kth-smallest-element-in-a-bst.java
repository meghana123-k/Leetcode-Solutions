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
    private void inorder(TreeNode root, ArrayList<Integer> ar) {
        if(root == null) return ;
        inorder(root.left, ar);
        ar.add(root.val);
        inorder(root.right, ar);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ar = new ArrayList<>();
        inorder(root, ar);
        return ar.get(k-1);
    }
}