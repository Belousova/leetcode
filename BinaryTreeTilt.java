//563. Binary Tree Tilt 
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
    
    private int totalTilt;
    
    public int findTilt(TreeNode root) {
        
        totalTilt = 0;
        valueSum(root);
        return totalTilt;
    }
    
    private int valueSum(TreeNode t) {
        if (t==null) {
            return 0;
        }
        
        int l = valueSum(t.left);
        int r = valueSum(t.right);
        
        int tilt = Math.abs(l - r);
        totalTilt += tilt;
        return t.val + l + r;
    }
}
