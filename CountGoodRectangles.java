//1725. Number Of Rectangles That Can Form The Largest Square
class Solution {
    public int countGoodRectangles(int[][] rectangles) {

        int maxsq = Integer.MIN_VALUE;
        int cnt = 0;

        for (int i=0; i<rectangles.length; i++){
            int l = Math.min(rectangles[i][0], rectangles[i][1]);
            if (l>maxsq) {
                maxsq = l;
                cnt = 1;
            } else if (l==maxsq) {
                cnt++;
            }

        }
        return cnt;
    }
}