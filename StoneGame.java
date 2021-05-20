//877. Stone Game
 /**
 * Alex and Lee play a game with piles of stones.  There are an even number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].

 * The objective of the game is to end with the most stones.  The total number of stones is odd, so there are no ties.

 * Alex and Lee take turns, with Alex starting first.  Each turn, a player takes the entire pile of stones from either the beginning or the end of the row.  This continues until there are no more piles left, at which point the person with the most stones wins.

 * Assuming Alex and Lee play optimally, return True if and only if Alex wins the game.

**/
class Solution {
    public boolean stoneGame(int[] piles) {
        int start = 0;
        int end = piles.length - 1;
        int sumFirst = 0;
        int sumSec = 0;
        boolean First = true;
        while (start+1<end-1) {
            if (Math.max(piles[start], piles[end-1]) > Math.max(piles[start+1], piles[end-1])) {
                
                if (First) {
                    sumFirst += piles[start];
                } else {
                    sumSec += piles[start];
                }
                start ++;
            } else {
                if (First) {
                    sumFirst += piles[end];
                } else {
                    sumSec += piles[end];
                }
                end--;
            }
        }
        if (start > end) {
            if (First) {
                sumFirst += Math.max(piles[start], piles[end]);
            } else {
                sumSec += Math.max(piles[start], piles[end]);
            }
        }
        return (sumFirst>sumSec);
    }
}
