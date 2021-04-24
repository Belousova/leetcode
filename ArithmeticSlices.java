//413. Arithmetic Slices
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        int cnt = 0;
        int dp = 0;
        for (int i=0; i<nums.length-2; i++) {
            if (nums[i+2] - nums[i+1] == nums[i+1] - nums[i]) {
                cnt ++;
                for (int j=i+3; j<nums.length; j++) {
                    if (nums[j] - nums[j-1] == nums[j-1]-nums[j-2]) {
                        cnt++;
                    } else {
                        break;
                    }
                }
            }
        }
        return cnt;
    }
}
