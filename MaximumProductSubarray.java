//152. Maximum Product Subarray
class Solution {
    public int maxProduct(int[] nums) {

        int res = nums[0];
        int maxcurr = nums[0];
        int mincurr = nums[0];
        for (int i = 1; i< nums.length; i++) {
            if (nums[i] < 0) {
                int t = maxcurr;
                maxcurr = mincurr;
                mincurr = t;
            }
            maxcurr = Math.max(nums[i], maxcurr*nums[i]);
            mincurr = Math.min(nums[i], mincurr*nums[i]);
            res = Math.max(res, maxcurr);
        }
        return res;
    }
}
