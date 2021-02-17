//797. All Paths From Source to Target
class Solution {   
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(0);
        helper(graph, l, 0, res);
        return res;
        
    }
    private void helper(int[][] graph, List<Integer> l, int i, List<List<Integer>> res){        
        if (i==graph.length-1) {
            res.add(new ArrayList<>(l));
            return;
            
        }
        int[] el = graph[i];
        if (el.length==0) return;
        for (int j: el) {
            l.add(j);
            helper(graph, l, j, res);
            l.remove(l.size()-1);
            
        }
        return;
    }
}
