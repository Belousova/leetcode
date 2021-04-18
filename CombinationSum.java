//39. Combination Sum
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<Integer>(), candidates, target, 0);
        return res;
    }
    private void helper(List<List<Integer>> res, List<Integer> templist, int[] candidates, int target, int start){
        if (target < 0) {
            return;
        }
        if (target==0) {
            res.add(new ArrayList<>(templist));
            return;
        }
        for (int i=start; i<candidates.length; i++){
            int n = candidates[i];
            if (n <= target) {
                templist.add(n);
                helper(res, templist, candidates, target-n, i);
                templist.remove(templist.size()-1);
            }
        }
        return;
    }
}
