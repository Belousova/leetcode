//427. Construct Quad Tree

/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
};
*/

class Solution {
    public Node construct(int[][] grid) {
        return constructNode(grid, 0, grid.length, 0, grid[0].length);
    }
    public Node constructNode(int[][] grid, int starti, int endi, int startj, int endj) {
        int n = grid[starti][startj];
        Node node = new Node( n == 1, true);
        for (int i = starti; i < endi; i++) {
            for (int j = startj; j < endj; j++) {
                if (grid[i][j] != n) {
                    //we need divide Node for 4 parts
                    node.isLeaf = false;
                    node.topLeft = constructNode(grid, starti, starti + (endi - starti)/2, startj, startj + (endj- startj)/2);
                    node.topRight = constructNode(grid, starti, starti + (endi - starti)/2, startj + (endj- startj)/2, endj);
                    node.bottomLeft = constructNode(grid, starti + (endi - starti)/2, endi, startj, startj + (endj- startj)/2);
                    node.bottomRight = constructNode(grid, starti + (endi - starti)/2, endi, startj + (endj- startj)/2, endj);
                    return node;
                }
            }
 
        }
        return node;
    }   
}
