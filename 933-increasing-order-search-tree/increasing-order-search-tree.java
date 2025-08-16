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
    private void inOrder(ArrayList<Integer> ar, TreeNode root) {
        if(root == null) return ;
        inOrder(ar, root.left);
        ar.add(root.val);
        inOrder(ar, root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> ar = new ArrayList<>();
        inOrder(ar, root);
        TreeNode res = new TreeNode(-1, null, null);
        TreeNode temp = res;
        for(int num : ar) {
            temp.right = new TreeNode(num);
            temp.left = null;
            temp = temp.right;
        }
        return res.right;
    }
}