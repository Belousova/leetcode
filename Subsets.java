class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        ans = helper(0, nums, ans);
        ans.add(new ArrayList<>());
        return ans;
    }
    private List<List<Integer>> helper(int i, int[] nums, List<List<Integer>> ll){

        if (i<nums.length-1) {

            ll = helper(i+1, nums, ll);
            int n = ll.size();
            for (int j=0; j<n; j++){
                List<Integer> l = new ArrayList<>(ll.get(j));
                l.add(nums[i]);
                ll.add(l);
            }
        }

        List<Integer> l = new ArrayList(Arrays.asList(nums[i]));
        ll.add(l);
        return ll;
    }
}