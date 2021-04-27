//404. Sum of Left Leaves
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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        
        if (root.left == null) {
            return sumOfLeftLeaves(root.right);
        }
        if (root.right == null) {
            if (root.left.left == null && root.left.right==null) {
                return root.left.val;
            } else {
                return sumOfLeftLeaves(root.left);
            }
        }
        
        if (root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        } else {
            return sumOfLeftLeaves(root.right) + sumOfLeftLeaves(root.left);
        }
    }
}
