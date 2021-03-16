//153. Find Minimum in Rotated Sorted Array
class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while (low < high) {
            int mid = low + (high-low)/2;
            if (nums[mid]==nums[high]) {
                return nums[mid];
            }
            if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid+1;
            }
        }
        return nums[low];
    }
}
