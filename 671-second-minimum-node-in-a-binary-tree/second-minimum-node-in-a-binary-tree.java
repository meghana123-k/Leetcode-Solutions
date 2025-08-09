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
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null) return -1;
        ArrayList<Integer> res = new ArrayList<>();
        dfs(root, res);
        long min = Long.MAX_VALUE;
        long sec = Long.MAX_VALUE;
        System.out.println(res);
        for(int i = 0; i < res.size(); i++) {
            if(min > res.get(i)) {
                sec = min;
                min = res.get(i);
            } else if(res.get(i) > min && res.get(i) < sec) {
                sec = res.get(i);
            }
        }
        return sec > Integer.MAX_VALUE? -1 : (int)sec;
    }
    public void dfs(TreeNode root, ArrayList<Integer> res) {
        if(root == null) return;
        dfs(root.left, res);
        res.add(root.val);
        dfs(root.right, res);
    }
}