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
    public void helper(TreeNode root, List<TreeNode> leaf) {
        if(root == null) return ;
        if(root.left == null && root.right == null) {
            leaf.add(root);
            return;
        }
        helper(root.left, leaf);
        helper(root.right, leaf);
    }
    public boolean help(TreeNode root, TreeNode target, List<TreeNode> path) {
        if(root == null) return false;
        path.add(root);
        if(root == target) {
            return true;
        }
        boolean lft = help(root.left, target, path);
        boolean rht = help(root.right, target, path);
        if(lft || rht) return true;
        path.remove(path.size()-1);
        return false;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<TreeNode> leaf = new ArrayList<>();
        helper(root, leaf);
        List<List<TreeNode>> paths = new ArrayList<>();
        for(int i = 0; i < leaf.size(); i++) {
            List<TreeNode> path = new ArrayList<>();
            // for(int j = 0; j < path.size(); j++) {
            //     System.out.print(leaf.get(j).val);
            // }
            help(root, leaf.get(i), path);
            paths.add(path);
        }
        List<String> res = new ArrayList<>();
        for(List<TreeNode> p : paths) {
            String str = "";
            for(TreeNode node : p) {
                str += node.val + "->";
            }
            res.add(str.substring(0, str.length()-2));
        }
        return res;
    }
}