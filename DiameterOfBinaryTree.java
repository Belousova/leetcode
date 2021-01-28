//543. Diameter of Binary Tree
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
    
    private int d = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
  
        if (root==null) {
            return 0;
            
        }
        helper(root);
        return d;
        
    }
    private int helper(TreeNode t){
        
        if (t.left == null && t.right == null) {
            return 1;
        }
        int l1 = 0;
        int l2 = 0;
        if (t.left!=null) {
            l1 = helper(t.left);
        }
        if (t.right!=null) {
            l2 = helper(t.right);
        }
        
        d = Math.max(l1+l2, d);
        return Math.max(l1, l2)+1;
    }
}
