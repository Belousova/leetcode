//1189. Maximum Number of Balloons
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] f = new int[26];
        for (char c: text.toCharArray()) {
            f[c -'a']++;
        }
        int res = Integer.MAX_VALUE;
        // b -1 a -1 l -2 o- 2 n-1
        res = Math.min(res, f['b'-'a']);
        res = Math.min(res, f['a'- 'a']);
        res = Math.min(res, f['l'-'a']/2);
        res = Math.min(res, f['o'-'a']/2);
        res = Math.min(res, f['n'- 'a']);
        return res;
    }
}
