//703. Kth Largest Element in a Stream
class KthLargest {
 //using PriorityQueue   
    final PriorityQueue<Integer> q;
    final int k;
    
    public KthLargest(int k, int[] nums) {
        
        this.k = k;
        q = new PriorityQueue<>(this.k);
        for (int n : nums){
            add(n);
        }
    }
    
    public int add(int val) {
        
        if (q.size()<k){
            q.offer(val);
        } else if (q.peek()<val){
            q.poll();
            q.offer(val);
        }
        return q.peek();
    }
    /*using BST
    TreeNode root;
    int k;
    class TreeNode {
        int val;
        int count = 1;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    
    private TreeNode add(TreeNode root, int val){
        if (root==null) {
            return new TreeNode(val);
        }
    //    if (root.val == val) {
      //      return root;
       // }
        root.count++;
        if (root.val>val){
            root.left = add(root.left, val);
        } else {
            root.right = add(root.right, val);
        }
        return root;
    }
    
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int n : nums){
            root = add(root, n);
        }
    }
    
    public int add(int val) {
        root = add(root, val);
        return findKthLargest();
    }
    
    private int findKthLargest(){
        int count = k;
        TreeNode walker = root;
        while (count>0){
            int pos = 1 + (walker.right == null ? 0 : walker.right.count);
            if (pos == count) {
                break;
            }
            if (pos > count) {
                walker = walker.right;
            } else {
                count -= pos;
                walker = walker.left;
            }
        }
        return walker.val;
    }*/
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
