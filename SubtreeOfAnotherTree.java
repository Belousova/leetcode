//572. Subtree of Another Tree
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (isEqualTree(root, subRoot)) {
            return true;
        } else {
            if (root.right != null && root.left!= null) {
                return isSubtree(root.right, subRoot) || isSubtree(root.left, subRoot);
            } else if (root.right!=null) {
                return isSubtree(root.right, subRoot);
            } else if (root.left!= null) {
                return isSubtree(root.left, subRoot);
            } else {
                return false;
            }
            
        }
    
    }
        
    private boolean isEqualTree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null && subRoot!= null) {
            return false;
        }
        if (root != null && subRoot == null) {
            return false;
        }
        if (root.val!=subRoot.val){
            return false;
        }
        return isEqualTree(root.right, subRoot.right) && isEqualTree(root.left, subRoot.left);
    }
}
