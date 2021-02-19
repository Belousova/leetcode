//173. Binary Search Tree Iterator
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
class BSTIterator {

    Stack<TreeNode> st;
    
    private void fillSt(TreeNode root) {
        while (root!=null){
            st.push(root);
            root = root.left;
        }
    }
    
    public BSTIterator(TreeNode root) {
        this.st = new Stack<TreeNode>();
        fillSt(root);
    }
    
    public int next() {
        TreeNode nd = st.pop();
        if (nd.right!=null){
            fillSt(nd.right);
        }
        return nd.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
