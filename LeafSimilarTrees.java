//872. Leaf-Similar Trees
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
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<Integer>();
        List<Integer> leaves2 = new ArrayList<Integer>();
        createList(root1, leaves1);
        createList(root2, leaves2);
      
        return leaves1.equals(leaves2);
    }
    private void createList(TreeNode root, List<Integer> list){
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }
        createList(root.left, list);
        createList(root.right, list);
        return;
    }
}
