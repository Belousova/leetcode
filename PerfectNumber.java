//507. Perfect Number
class Solution {
    public boolean checkPerfectNumber(int num) {
       int ans = 0;
        for (int i=1; i*i <= num; i++) {
            if (num%i==0) {
                ans += i;
                if (i*i != num) {
                    ans += num/i;
                }
            }
        }
        return ans-num ==num;
    }
}
