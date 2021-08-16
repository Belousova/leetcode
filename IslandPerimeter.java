// 463. Island Perimeter 
/**
 * You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.
 * 
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
 * 
 * The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
**/
class Solution {
    public int islandPerimeter(int[][] grid) {
        int per = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    //up
                    if (i==0) {
                        per++;
                    } else {
                        if (grid[i-1][j] == 0) {
                            per++;
                        }
                    }
                    //left
                    if (j==0) {
                        per++;
                    } else {
                        if (grid[i][j-1] == 0) {
                            per++;
                        }
                    }
                    //bottom
                    if (i==grid.length-1) {
                        per++;
                    } else {
                        if (grid[i+1][j] == 0) {
                            per++;
                        }
                    }
                    //right
                    if (j==grid[i].length-1) {
                        per++;
                    } else {
                        if (grid[i][j+1] == 0) {
                            per++;
                        }
                    }
                }
            }
        }
        return per;
    }
}
