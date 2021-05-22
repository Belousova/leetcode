//1254. Number of Closed Islands
/**
 * Given a 2D grid consists of 0s (land) and 1s (water).  An island is a maximal 4-  directionally connected group of 0s and a closed island is an island totally (all left, top, right, bottom) surrounded by 1s.

 * Return the number of closed islands.
**/
class Solution {
    public int closedIsland(int[][] grid) {
        int cnt = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    if (isIsland(i, j, grid)){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
    
    private boolean isIsland(int i, int j, int[][] grid) {
        if (i==0 || i== grid.length-1 || j==0 || j==grid[i].length-1) {
            grid[i][j] = 2;
            return false;
        }
        if (grid[i][j] == 2)  {
            return false;
        }

        if (grid[i][j] == 1) {
            return true;
        }
        grid[i][j] = 3;


        if (grid[i-1][j] == 2 || (grid[i-1][j]==0 && !isIsland(i-1, j, grid))) {
            grid[i][j] = 2;
            return false;
        }


        if (grid[i+1][j] == 2 || (grid[i+1][j] == 0 && !isIsland(i+1, j, grid))) {
            grid[i][j] = 2;
            return false;
        }

        if (grid[i][j-1] == 2 || (grid[i][j-1] == 0 && !isIsland(i, j-1, grid))) {
            grid[i][j] = 2;
            return false;
        }

        if (grid[i][j+1] == 2 || (grid[i][j+1] == 0 && !isIsland(i, j+1, grid))) {
            grid[i][j] = 2;
            return false;
        }

        return true;
    }
}
