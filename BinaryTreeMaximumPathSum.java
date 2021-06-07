//124. Binary Tree Maximum Path Sum
/**
 * A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in  the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
 *
 * The path sum of a path is the sum of the node's values in the path.
 *
 * Given the root of a binary tree, return the maximum path sum of any path.
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
/*
 in root - root.val
         - left + root.val
         - right + root.val
         - left + right + root.val
*/
class Solution {
    int res;
    public int maxPathSum(TreeNode root) {
        res = -1001;
        dfs(root);
        return res;
    }
    private int dfs(TreeNode root) {
        
        if (root == null) {
            return 0;
        }
        res = Math.max(res, root.val);
        
        if (root.right == null && root.left == null) {
            res = Math.max(res, root.val);
            return root.val;
        }
        
        int left = Math.max(dfs(root.left), 0);
        int right = Math.max(dfs(root.right), 0);
        
        int n = Math.max(left + right + root.val, root.val);
        res = Math.max(res, n);
        
        n = Math.max(left, right) + root.val;
        res = Math.max(res, n);
        return n;
        
    }
}
