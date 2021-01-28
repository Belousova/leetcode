//661. Image Smoother
class Solution {
    public int[][] imageSmoother(int[][] M) {
        
        int R = M.length;
        int C = M[0].length;
        
        int[][] ans = new int[R][C];
        
        for (int i = 0; i < R; i++) {
            for (int j=0; j < C; j++){
                int n = 0;
                for (int nr = i-1; nr <= i+1; ++nr) {
                    for (int nc = j-1; nc <= j+1; ++nc) {
                        if (0<=nr && nr < R && 0 <= nc && nc < C) {
                            ans[i][j] += M[nr][nc];
                            n++;
                        }
                    }
                }
                ans[i][j] /= n;
            }
        }
        return ans;
    }
}
