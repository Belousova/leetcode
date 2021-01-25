//665. Non-decreasing Array
class Solution {
    public boolean checkPossibility(int[] nums) {

        int idx = -1;

        for (int i=1; i < nums.length; i++) {

            if (nums[i] < nums[i-1]) {
                if (idx!=-1) return false;
                else idx = i;

                if (!(i==1 || (i>1 && nums[i-2] <= nums[i]) || (i < nums.length-1 && nums[i+1] >= nums[i-1]) || (i==nums.length-1))) return false;
            }
        }
        return true;

    }
}