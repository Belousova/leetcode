//45. Jump Game II
class Solution {
    public int jump(int[] nums) {
        int current = 0;
        int n = 0;
        while (current<nums.length-1) {
            current = next(nums, current);
            n++;
        }
        return n;
    }
    private int next(int[] nums, int current){
        if (current + nums[current] >= nums.length-1) {
            return nums.length-1;
        }
        int m = 0;
        int index = current;
        for (int i=current; i<=current+nums[current]; i++) {
            if (m <= nums[i]+i) {
                m = nums[i] + i;
                index = i;
            }
        }
        return index;
    }
}
