//523. Continuous Subarray Sum
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                int d = sum % k;
                if (map.containsKey(d)) {
                    if (i - map.get(d) > 1) {
                        return true;
                    }
                } else {
                    map.put(d, i);
                }

        }
        return false;
    }
}
