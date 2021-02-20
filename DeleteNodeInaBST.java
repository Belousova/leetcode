//450. Delete Node in a BST
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
    public TreeNode deleteNode(TreeNode root, int key) {
       
        if (root==null) return root;
        if (root.val==key) {
            //delete this node
            if (root.left==null && root.right==null) {
                return null;
            }
            if (root.left == null && root.right!=null) {
                return root.right;
            }
            if (root.left !=null && root.right == null) {
                return root.left;
            }
            if (root.left!=null && root.right!=null) {
                TreeNode successor = getSuccessor(root.right);
                root.val = successor.val;
                root.right = deleteNode(root.right, root.val);
            }
        } else if (root.val>key) {
            root.left = deleteNode(root.left, key);
        } else {
            root.right = deleteNode(root.right, key);
        }
        return root;
        
    }
    private TreeNode getSuccessor(TreeNode node){
        while (node.left != null) {
            node = node.left;
            
        }
        return node;
        
    }
}
