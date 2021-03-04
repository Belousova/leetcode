//441. Arranging Coins
class Solution {
    public int arrangeCoins(int n) {
        if (n==0) return 0;
        int low = 1;
        int high = n;
        while (low<=high) {
            long mid = low + (high-low)/2;
            long s = (mid+1)*mid/2;
            if (s==n) return (int)mid;
            if (s>n) {
                high = (int)mid-1;
            } else {
                low = (int)mid+1;
            }
        }
        return high;
    }
}
