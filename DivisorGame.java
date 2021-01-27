//1025. Divisor Game
class Solution {
    public boolean divisorGame(int N) {

        if (N<2) {
            return false;
        }
        boolean[] dp = new boolean [N+1];
        dp[1] = false;
        dp[2] = true;
        for (int i=3; i<dp.length; i++) {
            for (int j=1; j<i; j++) {
                if (i%j == 0) {
                    if (!dp[i-j]) {
                        dp[i] = true;
                        break;

                    }
                }
            }
        }
        return dp[N];

        // return (N%2==0);
    }
}