//70. Climbing Stairs
class Solution {
    public int climbStairs(int n) {
        if (n==1) {
            return 1;
        }
        int n1 = 1;
        int n2 = 1;
        for (int i=2; i<=n; i++) {
            int tmp = n1 + n2;
            n1 = n2;
            n2 = tmp;
        }
        return n2;
    }   
}
