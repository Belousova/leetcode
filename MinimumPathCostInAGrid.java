//2304. Minimum Path Cost in a Grid
class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
       int[][] dp = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                dp[i][j] = dp[i][j] + grid[i][j];
                int[] moves = moveCost[grid[i][j]];
                
                for (int k = 0; k < moves.length; k++) {
                    dp[i+1][k] = (dp[i+1][k] == 0 ? moves[k] + dp[i][j] : Math.min(dp[i+1][k], moves[k] + dp[i][j]));
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < dp[0].length; j++) {
            ans = Math.min(dp[dp.length-1][j] + grid[grid.lngth-1][j], ans);
        }
        return ans;
    }
}e
