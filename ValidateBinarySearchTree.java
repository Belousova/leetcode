//98. Validate Binary Search Tree
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
    public boolean isValidBST(TreeNode root) {
        
        return checkSubTree(root, null, null);
        
    }
    private boolean checkSubTree(TreeNode root, Integer val1, Integer val2) {
        
        if (root==null){
            return true;
        }
        
        if ((val1!=null && root.val<=val1) || (val2!=null && root.val>=val2)) {
            return false;
        }
        return checkSubTree(root.left, val1, root.val) && checkSubTree(root.right, root.val, val2);
    }
}
