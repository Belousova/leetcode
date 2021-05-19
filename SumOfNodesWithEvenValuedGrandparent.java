//1315. Sum of Nodes with Even-Valued Grandparent
/**
 * Given a binary tree, return the sum of values of nodes with even-valued  grandparent.  (A grandparent of a node is the parent of its parent, if it exists.)
 * 
 * If there are no nodes with an even-valued grandparent, return 0.
 */
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
    public int sumEvenGrandparent(TreeNode root) {
        return evenGrandparent(root, null, null);
    
    }
    private int evenGrandparent(TreeNode root, TreeNode parent, TreeNode grand){
        if (root == null) {
            return 0;
        }
        int n = 0;
        if (grand!=null && grand.val%2 == 0) {
            n = root.val;
        }
        return n + evenGrandparent(root.left, root, parent) + evenGrandparent(root.right, root, parent);
        
    }
    
    
}
