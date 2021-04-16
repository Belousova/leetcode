//77. Combinations
class Solution {
    public List<List<Integer>> combine(int n, int k) {
    
        List<Integer> ll = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            ll.add(i);
        }
        return helper(ll, k);
        
    }
    private List<List<Integer>> helper(List<Integer> l, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k==1) {
            for (int i=0; i<l.size(); i++) {
                List<Integer> lp = new ArrayList<>();
                lp.add(l.get(i));
                res.add(lp);
            }
            return res;
        }
        for (int i=0; i<=l.size()-k; i++) {
            int n = l.get(i);
            List<Integer> newl = new ArrayList<>();
            for (int j=i+1; j<l.size(); j++) {
                newl.add(l.get(j));
            }
            if (newl.size()>0) {
                List<List<Integer>> ll = helper(newl, k-1);
                for (int j=0; j<ll.size(); j++) {
                    List<Integer> l1 = ll.get(j);
                    l1.add(n);
                    res.add(l1);
                }
            }
        }
        return res;
    }
}
