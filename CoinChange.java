//322. Coin Change
class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int max = amount+1;
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;
        Arrays.sort(coins);
        for (int i=1; i<max; i++) {
            for (int j=0; j<coins.length; j++){
                if (i>=coins[j]) {
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                } else {
                    break;
                }
            }
        }
        return dp[amount] == max ?-1:dp[amount];
    }
}
