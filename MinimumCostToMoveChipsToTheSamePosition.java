//1217. Minimum Cost to Move Chips to The Same Position
class Solution {
    public int minCostToMoveChips(int[] position) {
        int zero = 0;
        int one = 0;
        for (int i=0; i<position.length; i++){
            if (position[i]%2==0) {
                zero++;
            } else {
                one ++;
            }
        }
        return Math.min(zero, one);
    }
}
