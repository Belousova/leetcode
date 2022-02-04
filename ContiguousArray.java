//525. Contiguous Array
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();    
        map.put(0,-1);
        int n = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                n++;
            } else {
                n--;
            }
            if (map.containsKey(n)) {
                ans = Math.max(ans, i - map.get(n));
            } else {
                map.put(n,i);
            }
        }
        return ans;
    }
}
