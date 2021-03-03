//1512. Number of Good Pairs 
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n: nums) {
            map.put(n, map.getOrDefault(n,0) +1);
        }
        int res = 0;
        for (int n: map.values()) {
            if (n>1) {
                res+= (n*(n-1)/2);
            }
        }
        return res;
    }
}
