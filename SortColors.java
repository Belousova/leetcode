class Solution {
    public void sortColors(int[] nums) {
  /*
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i=0; i<nums.length; i++){
            if (nums[i]==0) count0++;
            if (nums[i]==1) count1++;
            if (nums[i]==2) count2++;
        }
        count1 = count0+count1;

        for (int i=0; i<nums.length; i++) {
            if (i<count0) nums[i]=0;
                else if (i<count1) nums[i]=1;
                    else nums[i] = 2;
        }*/
        int start = 0;
        int end = nums.length - 1;
        int i = 0;
        while (i <= end) {
            if (nums[i] == 0) {
                nums[i]=1;
                nums[start]=0;
                start++;
                i++;
            } else if (nums[i] == 2) {
                nums[i]=nums[end];
                nums[end]=2;
                end--;
            } else {
                i++;
            }
        }
        return;
    }
}