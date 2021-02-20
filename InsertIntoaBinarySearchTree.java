//701. Insert into a Binary Search Tree
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
    /*recursive solution
        if (root==null) {
            return new TreeNode(val);
        } 
        if (root.val>val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        
        return root;
     */
        if (root==null) return new TreeNode(val);
        TreeNode current = root;
        while (true) {
            if (current.val>val){
                if (current.left==null){
                    current.left = new TreeNode(val);
                    break;
                }
                current = current.left;
            } else {
                if (current.right==null){
                    current.right = new TreeNode(val);
                    break;
                }
                current = current.right;
            }
        }
        return root;
    }
}
