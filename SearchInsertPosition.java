//35. Search Insert Position
class Solution {
    public int searchInsert(int[] nums, int target) {
        int right = nums.length-1;
        int left = 0;
        while (left<=right) {
            int mid = (right-left)/2 + left;
            if (nums[mid] == target) return mid;
            if (nums[mid]>target) {
                right = mid-1;
            } else {
                left = mid +1;
            }
        }
        return left;
    }
}
