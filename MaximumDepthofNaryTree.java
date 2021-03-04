//559. Maximum Depth of N-ary Tree
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
//BFS
     /*   if (root==null) return 0;
        int res = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            res++;
            int s = q.size();
            for (int i=0; i<s; i++){
                Node cur = q.remove();
                for (Node c: cur.children) {
                    q.add(c);
                }
            }
        }
        return res;*/
        if (root==null) return 0;
        return dfs(root,1);
    }
    private int dfs(Node root, int n){
        if (root==null) return n;
        int i = 0;
        for (Node c:root.children) {
            i = Math.max(i, dfs(c, 1));
        }
        return i+n;
    }
}
