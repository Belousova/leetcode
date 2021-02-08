//55. Jump Game
class Solution {
    public boolean canJump(int[] nums) {
     
        if (nums.length==1) return true;
        int maxIndex = 0;
        int n = nums.length-1;
        for (int i=0; i<nums.length; i++){
            if (maxIndex >= i) {
                maxIndex = Math.max(i+nums[i],maxIndex);
                if (maxIndex >=n) return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
