//53. Maximum Subarray
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length==1) {
            return nums[0];
        }    
        int maxsum = nums[0];
        int cursum = nums[0];
        for (int i=1; i<nums.length; i++) {
            if (nums[i] > cursum + nums[i]) {
                cursum = nums[i];
            } else {
                cursum += nums[i];
            }
            maxsum = Math.max(maxsum, cursum);
        }
        return maxsum;
    }
}
