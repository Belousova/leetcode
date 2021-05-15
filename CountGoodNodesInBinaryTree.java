//1448. Count Good Nodes in Binary Tree
/**
* Given a binary tree root, a node X in the tree is named good if in the path from root * to X there are no nodes with a value greater than X.
* 
* Return the number of good nodes in the binary tree.
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
    
    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return goodNodes(root, root.val) + 1;
    }
    private int goodNodes(TreeNode root, int max) {
        
        int r = 0;
        int l = 0;
        if (root.left != null) {
            if (root.left.val >= max) {
                l = goodNodes(root.left, root.left.val) + 1;
            } else {
                l = goodNodes(root.left, max);
            }
        }
        if (root.right != null) {
            if (root.right.val >= max) {
                r = goodNodes(root.right, root.right.val) + 1;
            } else {
                r = goodNodes(root.right, max);
            }    
        }
        return l + r;
    }
}
