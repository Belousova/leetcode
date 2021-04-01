//231. Power of Two
class Solution {
    public boolean isPowerOfTwo(int n) {
        //1,2,4,8,16,32,64,128,
   /*recursive
        if (n==0) {
            return false;
        }
        if (n==1 || n==2) {
            return true;
        }
        if (n%2==0) {
            return isPowerOfTwo(n/2);
        } else {
            return false;
        }
    */
        return n > 0 && ((n & (n-1))== 0);
    }
}
