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
    private void inorder(TreeNode root, ArrayList<Integer> res) {
        if(root == null) return ;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root1, res);
        inorder(root2, res);
        Collections.sort(res);
        return res;
    }
}