//228. Summary Ranges
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        if (nums.length==0) return res;
        if (nums.length==1) {
            res.add(nums[0]+"");
            return res;
        }
        int start = nums[0];
        int end = nums[0];
        for (int i=1; i<nums.length; i++){
            if (nums[i]>end+1) {
                if (start==end) {
                    res.add(start+"");
                } else {
                    res.add(start+"->"+end);
                }
                start = nums[i];
                end = start;
            } else {
                end = nums[i];
            }
        }
        if (start==end) {
            res.add(start+"");
        } else {
            res.add(start+"->"+end);
        }
        return res;
    }
}
