//338. Counting Bits
class Solution {
    public int[] countBits(int num) {
        
        int [] d = new int[num+1];
        d[0] = 0;
        for (int i=1; i<=num; i++) {
            d[i] = d[i/2] + i%2;
        
        }
        return d;
    }
}
