//33. Search in Rotated Sorted Array
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid]>=nums[low]) {
                //first half sorted
                if (nums[mid]>target&&nums[low]<=target) {
                    //in first half
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            } else {
                //second half sorted
                if (nums[high]>=target&&target>nums[mid]) {
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
