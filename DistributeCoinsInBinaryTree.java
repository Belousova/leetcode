//979. Distribute Coins in Binary Tree
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
    int cnt;
    public int distributeCoins(TreeNode root) {
        cnt = 0;
        helper(root);
        return cnt;
    }
    private int[] helper(TreeNode root){
        
        int[] res = new int[2];
        if (root == null) {
            return res;
        }
        
        int[] left = new int[2];
        int[] right = new int[2];
        if (root.left!=null) {
            left = helper(root.left);
        }
        if (root.right!=null) {
            right = helper(root.right);
        }
        
        res[0] = left[0] + right[0] + root.val;
        res[1] = left[1] + right[1] + 1;
        cnt += Math.abs(res[0] - res[1]);
        return res;
    }
}
