//889. Construct Binary Tree from Preorder and Postorder Traversal
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
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        return helper(pre, post, 0, pre.length-1, 0, post.length-1);
        
    }
    private TreeNode helper(int[] pre, int[] post, int pre_start, int pre_end, int post_start, int post_end){
        if (pre_start<=pre_end) {
            TreeNode root = new TreeNode(pre[pre_start]);
            if (pre_start<pre_end) {
                int lefthead = pre[pre_start+1];
                int rightend = post[post_end-1];
                int index_left = findRoot(post, lefthead, post_start);
                int index_right = findRoot(pre, rightend, pre_start);
                if (lefthead == rightend) {
                    root.left = helper(pre, post, pre_start +1, pre_end, post_start, post_end -1 );
                    root.right = null;}
                else {
                    root.left = helper(pre, post, pre_start+1, index_right-1, post_start, index_left);
                    root.right = helper(pre, post, index_right, pre_end, index_left+1, post_end-1);}
            }
            return root;
            
        } else {
            return null;
            
        }
        
    }
    private int findRoot(int[] arr, int val, int start) {
        for (int i=start; i<arr.length; i++) {
            if (arr[i] == val) {
                return i;
                
            }
        }
        return -1;
    }
  
}
