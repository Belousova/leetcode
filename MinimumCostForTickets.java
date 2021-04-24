//983. Minimum Cost For Tickets
class Solution {
    public int mincostTickets(int[] days, int[] costs) {
 
        int dp[] = new int[days[days.length-1]+1];
        int last = 0;
        for (int i=1; i< dp.length; i++) {
            if (i < days[last]) {
                dp[i] = dp[i-1];
            } 
            if (i==days[last]) {
                //travel this day
                last ++;
                if (i>30) {
                    dp[i] = Math.min(dp[i-1] + costs[0], 
                                Math.min(costs[1] + dp[i-7], costs[2] + dp[i-30]));
                } else if (i>7) {
                    dp[i] = Math.min(dp[i-1] + costs[0], 
                                     Math.min(costs[1] + dp[i-7], costs[2]));
                } else {
                    dp[i] = Math.min(dp[i-1] + costs[0], Math.min(costs[1],costs[2]));
                }
            } 
        }
        return dp[dp.length-1];
    }       
}
