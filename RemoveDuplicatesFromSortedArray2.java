//80. Remove Duplicates from Sorted Array II
class Solution {
    public int removeDuplicates(int[] nums) {
        int first = 2;
        int sec = 2;
        while (sec < nums.length) {
            if (nums[sec]!=nums[first-2]) {
                nums[first++] = nums[sec++];
            } else {
                sec++;
            }
        }
        return first;
    }
}
