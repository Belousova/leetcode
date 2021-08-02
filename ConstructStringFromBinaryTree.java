//606. Construct String from Binary Tree
/**
 * Given the root of a binary tree, construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way, and return it.
 *
 * Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string and the original binary tree.
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
    public String tree2str(TreeNode root) {
        
        if (root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.toString();
        
    }
    
    public void helper(TreeNode root, StringBuilder sb) {
    
        if (root == null) {
            return;
        }
        
        sb.append(Integer.toString(root.val));
        
        if (root.left == null && root.right == null) {
            return;
        }
        if (root.left == null) {
            sb.append("()");
        } else {
            sb.append("(");
            helper(root.left, sb);
            sb.append(")");
        } 
        if (root.right != null) {
            sb.append("(");
            helper(root.right, sb);
            sb.append(")");
        }
        return;
    }
}
