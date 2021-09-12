//99. Recover Binary Search Tree
/**
 * You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its structure.
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
    TreeNode peakMax = null;
    TreeNode peakMin = null;
    TreeNode prevNode;
    int prev;
 
    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }
        prev = Integer.MIN_VALUE;
        prevNode = null;
        traverse(root);
        if (peakMax!=null) {

            int tmp = peakMax.val;
            peakMax.val = peakMin.val;
            peakMin.val = tmp;
        }
        
    }
    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left!=null) {
            traverse(root.left);
        }
        if (root.val < prev) {
            if (peakMax == null) {
                peakMax = prevNode;
                peakMin = root;
            } else {
                peakMin = root;
                return;
            }
        }
        prev = root.val;
        prevNode = root;
        
        if (root.right!=null) {
            traverse(root.right);
        }
    }
}
