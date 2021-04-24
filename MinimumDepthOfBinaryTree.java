//111. Minimum Depth of Binary Tree
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
    /* DFS
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left != null && root.right != null) {
            return Math.min(minDepth(root.left), minDepth(root.right)) +1;
        }
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        return minDepth(root.left) + 1; 
    } 
    */
    //BFS
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        int minLevel = 0;
        q.add(root);
        int cnt = 0;
        while (!q.isEmpty()) {
            cnt = q.size();
            minLevel ++;
            while (cnt > 0) {   
                TreeNode t = q.remove();
                if (t.left == null && t.right == null) {
                    return minLevel;
                }
                if (t.left != null) {
                    q.add(t.left);
                }
                if (t.right != null) {
                    q.add(t.right);
                }
                cnt--;
            }      
        }
        return minLevel;
    } 
}
