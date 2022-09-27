//2357. Make Array Zero by Subtracting Equal Amounts
class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);

        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0) {
                if (i > 0) {
                    if (nums[i-1]!=nums[i]) {
                        n++;
                    }
                } else {
                    n++;
                }
            }
        }
        return n;
    }
}
