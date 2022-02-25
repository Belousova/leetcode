//1991. Find the Middle Index in Array
class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];
        sum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i-1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            int leftsum, rightsum;
            if (i == 0) {
                leftsum = 0;
            } else {
                leftsum = sum[i-1];
            }
            rightsum = sum[n-1] - sum[i];
            if (leftsum == rightsum) {
                return i;
            }
        }
        
        return -1;
    }
}
