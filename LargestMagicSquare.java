//1895. Largest Magic Square
class Solution {
    public int largestMagicSquare(int[][] grid) {
        int[][] gridNew = new int[grid.length+1][grid[0].length+1];
        for (int i = 0; i < gridNew.length; i++) {
            for (int j = 0; j < gridNew[i].length; j++) {
                if (i == 0 || j == 0) {
                    gridNew[i][j] = 0;
                } else {
                    gridNew[i][j] = grid[i-1][j-1];
                }
            }
        }
        int[][] sumRow = new int[gridNew.length][gridNew[0].length];
        int[][] sumCol = new int[gridNew.length][gridNew[0].length];
        int[][] sumDL = new int[gridNew.length][gridNew[0].length];
        int[][] sumDR = new int[gridNew.length][gridNew[0].length];

        int res = 1;

        for (int i = 1; i < gridNew.length; i++) {
            for (int j = 1; j < gridNew[i].length; j++) {
                sumCol[i][j] = sumCol[i][j - 1] + gridNew[i][j];
                sumRow[i][j] = sumRow[i - 1][j] + gridNew[i][j];
                sumDL[i][j] = (j == gridNew[i].length - 1) ? gridNew[i][j] : sumDL[i - 1][j + 1] + gridNew[i][j];
                sumDR[i][j] = gridNew[i][j] + sumDR[i - 1][j - 1];
            }
        }
        int m = Math.min(grid.length, grid[0].length);
        while (m > 1) {
            for (int i = 1; i < gridNew.length +1 - m; i++) {
                for (int j = 1; j < gridNew[i].length + 1 - m; j++) {
                    int p = (j +m == gridNew[i].length ) ? sumDL[i + m - 1][j] : sumDL[i+m-1][j] - sumDL[i-1][j+m];
                    if (sumDR[i + m - 1][j + m - 1] - sumDR[i-1][j-1] == p) {
                        boolean found = true;
                        int k = i;
                        while (k < i + m && found) {
                            if (found) {
                                for (int l = i; l < i + m; l++) {
                                    if (sumCol[l][j + m - 1] - sumCol[l][j-1]!= p) {
                                        found = false;
                                        break;
                                    }
                                }
                            }
                            if (found) {
                                for (int l = j; l < j + m; l++) {
                                    if (sumRow[i + m - 1][l] - sumRow[i-1][l] != p) {
                                        found = false;
                                        break;
                                    }
                                }
                            }
                            if (found) {
                                return m;
                            }
                            k++;
                        }
                    }
                }
            }
            m--;
        }
        return 1;
    }
}
