//120. Triangle
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        if (triangle.size()==1) return triangle.get(0).get(0);
        int[] dp = new int[triangle.size()];
                
        for (int i= triangle.size()-1; i > 0;  i--) {
            List<Integer> row = triangle.get(i);
            for (int j=0; j < row.size()-1; j++ ) {
                dp[j] = Math.min(row.get(j)+dp[j], row.get(j+1)+dp[j+1]);
            }
        }
        
        return dp[0] + triangle.get(0).get(0);
        
    }
}
