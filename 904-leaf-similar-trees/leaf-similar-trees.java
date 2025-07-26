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
    public static void R1(TreeNode root, ArrayList<Integer> l1) {
        if(root.left == null && root.right == null) 
        {
            //System.out.print(root.val+" ");
            l1.add(root.val);
        }
        if(root.left != null) R1(root.left, l1);
        if(root.right != null) R1(root.right, l1);
    }
    public static void R2(TreeNode root, ArrayList<Integer> l2) {
        if(root.left == null && root.right == null) 
        {
            //System.out.print(root.val+" ");
            l2.add(root.val);
        }
        if(root.left != null) R2(root.left, l2);
        if(root.right != null) R2(root.right, l2);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        R1(root1, l1);
        R2(root2, l2);
        System.out.print(l1+" "+l2);
        if(l1.size() != l2.size()) return false;
        return l1.equals(l2);
    }
}