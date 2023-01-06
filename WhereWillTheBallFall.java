class Solution {
    public int[] findBall(int[][] grid) {
        int[] dp = new int[grid[0].length];
        for (int j = 0; j < dp.length; j++) {
            dp[j] = j;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                int k = dp[j];
                if (k != -1) {
                    if (grid[i][k] == 1) {
                        if (k == grid[i].length-1 || grid[i][k+1]==-1) {
                            dp[j] = -1;
                        } else {
                            dp[j] = k+1;
                        }
                    } else {
                        if (k==0 || grid[i][k-1]==1) {
                            dp[j] = -1;
                        } else {
                            dp[j] = k-1;
                        }
                    }
                }
            }
        }
        return dp;
    }
}
