//213. House Robber II
class Solution {
    public int rob(int[] nums) {
        
        if (nums == null || nums.length==0) {
            return 0;
        }
        
        if (nums.length==1) {
            return nums[0];
        }
        int max1 = helper(nums, 0, nums.length-2);
        int max2 = helper(nums, 1, nums.length-1);
        
        return Math.max(max1, max2);
    }
    private int helper(int[] nums, int start, int end){
        if (end<start) {
            return 0;
        }
    
        int d0 = 0, d1 = 0, d2 = nums[start]; 
        
        for (int i= start+1; i<=end; i++){
            
            int tmp = Math.max(d0,d1) + nums[i];
            d0 = d1;
            d1 = d2;
            d2 = tmp;
        }
        return Math.max(d2,d1);
    }
}
