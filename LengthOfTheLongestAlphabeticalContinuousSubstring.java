//2414. Length of the Longest Alphabetical Continuous Substring
class Solution {
    public int longestContinuousSubstring(String s) {
        int n = 1;
        int maxn = 1;
        for (int i = 1 ; i < s.length(); i++) {
            if ((s.charAt(i)-1) == s.charAt(i-1)) {
                n++;
                maxn = Math.max(n, maxn);
            } else {
                n = 1;
            }
        }
        return maxn;
    }
}
