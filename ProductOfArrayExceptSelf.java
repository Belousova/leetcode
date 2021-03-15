//238. Product of Array Except Self
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums==null || nums.length==0) return nums;
        
        int[] res = new int[nums.length];
        //for i elemetn = product of form i+1 to n
        //for i element = product of from 0 to i-1
        res[nums.length-1] = 1;
        for (int i=nums.length-2; i>=0; i--) {
            res[i] = res[i+1]*nums[i+1];
        }
        int prev = nums[0];
        for (int i=1; i<nums.length; i++) {
            res[i] = res[i]*prev;
            prev *= nums[i];
        }
        return res;
    }
}
