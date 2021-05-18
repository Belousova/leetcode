//1110. Delete Nodes And Return Forest
/**
 * Given the root of a binary tree, each node in the tree has a distinct value.
 * 
 * After deleting all nodes with a value in to_delete, we are left with a forest (a disjoint    union of trees).

 * Return the roots of the trees in the remaining forest. You may return the result in any      order.
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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        List<TreeNode> ans = new ArrayList<>();
        
        if (root == null) {
            return ans;
        }
        if (to_delete.length == 0) {
            ans.add(root);
            return ans;
        }
        Arrays.sort(to_delete);
        
        helper(root, null, 0, to_delete, ans);
        
        return ans;
    }
    private void helper(TreeNode root, TreeNode parent, int l, int[] to_delete, List<TreeNode> ans){
        
        if (root == null) {
            return;
        }
        if (inDeleteList(root.val, to_delete)) {
            
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.left = null;
            root.right = null;
            if (parent!=null) {
                if (l == 1) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
            helper(left, null, 0, to_delete, ans);
            helper(right, null, 0, to_delete, ans);
        } else {
            if (parent == null) {
                ans.add(root);
            }
            helper(root.left, root, 1, to_delete, ans);
            helper(root.right, root, 2, to_delete, ans);
        }
        return;
    }
     private boolean inDeleteList(int val, int[] to_delete){
            for (int i=0; i<to_delete.length; i++) {
                if (to_delete[i] == val) {
                    return true;
                }
                if (to_delete[i] > val) {
                    break;
                }
            }
            return false;
        }
    
}
