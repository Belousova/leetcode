//518. Coin Change 2
class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount+1];
        for (int i=0; i<dp.length; i++){
            dp[i][0]=1;
        }
        for(int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                int n = 0;
                if (j >= coins[i-1]) {
                    n = dp[i][j-coins[i-1]];
                }
                dp[i][j] = dp[i-1][j] + n;
            }
        }
        return dp[dp.length-1][amount];
    }

}
