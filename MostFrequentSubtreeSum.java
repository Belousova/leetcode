//508. Most Frequent Subtree Sum
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
    
    int max;
    public int[] findFrequentTreeSum(TreeNode root) {
       
        Map<Integer, Integer> map = new HashMap<>();
        max = 0;
        helper(root, map);
        List<Integer> ans = new ArrayList<>();
        map.forEach((k,v) -> {
            if (v == max) {ans.add(k);};
        });
        int[] res = new int[ans.size()];
        for (int i=0; i<ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    
        
    }
    private int helper(TreeNode root, Map<Integer, Integer> map){
        
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            int k = map.getOrDefault(root.val, 0) + 1;
            max = Math.max(max, k);
            map.put(root.val, k);
            return root.val;
            
        }
        int sum = root.val;
        if (root.left!= null) {
            sum += helper(root.left, map);
        }
        if (root.right!= null) {
            sum += helper(root.right, map);
        }
        int k = map.getOrDefault(sum, 0) + 1;
        max = Math.max(max, k);
        map.put(sum, k);
        return sum;
        
    }
}
