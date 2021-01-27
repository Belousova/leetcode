//746. Min Cost Climbing Stairs
class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int f1 = cost[0];
        int f2 = cost[1];
        int tmp =0;

        for (int i=2; i<cost.length; i++){
            tmp = Math.min(f1, f2) + cost[i];
            f1 = f2;
            f2 = tmp;
        }
        return Math.min(f1, f2);
    }
}