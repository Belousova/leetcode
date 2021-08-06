//114. Flatten Binary Tree to Linked List
/**
 * Given the root of a binary tree, flatten the tree into a "linked list":
 *
 * The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
 * The "linked list" should be in the same order as a pre-order traversal of the binary tree.
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
    public void flatten(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }
        Stack<TreeNode> st = new Stack<TreeNode>();
        
        TreeNode node = root;
        while (node.right != null || node.left !=null || st.size()>0) {
            
            if (node.right == null && node.left == null) {
                TreeNode node2 = st.pop();
                node.right = node2;
                node = node2;
            } else {
            
                if (node.left != null) {
                    if (node.right != null) {
                        st.push(node.right);
                    }
                    node.right = node.left;
                    node.left = null;
                }
                node = node.right;
            }
        }
        
    }
}
