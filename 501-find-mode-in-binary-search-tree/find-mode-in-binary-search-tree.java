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
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map =  new HashMap<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()) {
            TreeNode front = que.remove();

            map.put(front.val, map.getOrDefault(front.val, 0)+1);

            if(front.left != null) que.add(front.left);
            if(front.right != null) que.add(front.right);
        }
        
        int maxVal = 0;
        for(int key : map.keySet()) {
            maxVal = Math.max(map.get(key), maxVal);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int key : map.keySet()) {
            if(maxVal == map.get(key)) {
                res.add(key);
            }
        }
        int r[] = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            r[i] = res.get(i);
        }
        return r;
    }
}