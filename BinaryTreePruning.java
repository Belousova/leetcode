//814. Binary Tree Pruning
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
    public TreeNode pruneTree(TreeNode root) {

        if (root == null) {
            return null;
        }
        root.right = pruneTree(root.right);
        root.left = pruneTree(root.left);
        
        if (root.right == null && root.left == null && root.val == 0) {
            return null;
        }
        
        return root;
    }
}
