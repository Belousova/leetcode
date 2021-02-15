//171. Excel Sheet Column Number
class Solution {
    public int titleToNumber(String s) {
    
        int ans = 0;
        int n = 0;
        for (int i=s.length()-1; i>=0; i--){
            int k = (int)s.charAt(i) - 64;
            ans += Math.pow(26, n) * k;
            n++;
        }
        return ans;
    }
}
