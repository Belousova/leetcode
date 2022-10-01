//2415. Reverse Odd Levels of Binary Tree
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
    public TreeNode reverseOddLevels(TreeNode root) {
        
        Queue <TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int level = 0;
        while (q.size() > 0) {
            int n = q.size();
            if (level%2 != 0) {
                int[] vals = new int[n];
                for (int i = 0; i < n; i++) {
                    TreeNode t = q.remove();
                    vals[i] = t.val;
                    q.add(t);
                }
                for (int i = 0; i < n; i ++) {
                    TreeNode t = q.remove();
                    t.val = vals[n-1-i];
                    if (t.left != null && t.right!=null) {
                        q.add(t.left);
                        q.add(t.right);                   
                    }
                }
            } else {
                for (int i = 0 ; i < n; i++) {
                    TreeNode t = q.remove();
                    if (t.left != null && t.right!=null) {
                        q.add(t.left);
                        q.add(t.right);
                    }
                }
            }
            level++;
            
            }
            return root;
        
    }
}
