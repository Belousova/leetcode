//1325. Delete Leaves With a Given Value
/**
 * Given a binary tree root and an integer target, delete all the leaf nodes with value target.

 * Note that once you delete a leaf node with value target, if it's parent node becomes a leaf node and has the value target, it should also be deleted (you need to continue doing that until you can't).
**/
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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return null;
        }
        root.right = removeLeafNodes(root.right, target);
        root.left = removeLeafNodes(root.left, target);
        
        if (root.right == null && root.left == null) {
            if (root.val == target) {
                return null;
            }
        }
        
        return root;
    }
}
