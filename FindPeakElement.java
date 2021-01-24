//162. Find Peak Element
class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length==1) {return 0;}

        int left = 0;
        int right = nums.length-1;
        while (left<right) {
            int mid = left + (right-left)/2;
            if (nums[mid] > nums[mid+1]) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
}