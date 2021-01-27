//303. Range Sum Query - Immutable
class NumArray {

    private int[] sum;

    public NumArray(int[] nums) {
        //calculate sum
        sum = new int[nums.length+1];
        sum[0] = 0;
        for (int i=0; i<nums.length; i++) {
            sum[i+1] = nums[i] + sum[i];

        }
    }

    public int sumRange(int i, int j) {
        //return diff
        return sum[j+1]-sum[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */