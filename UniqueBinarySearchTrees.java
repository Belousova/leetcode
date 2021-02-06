//96. Unique Binary Search Trees
class Solution {
    public int numTrees(int n) {
        if (n==0) return 0;
        int[] d = new int[n+1];
        d[0] = 1;
        d[1] = 1;
        for (int i=2; i<=n; i++) {
            int k = i/2;
            if (i%2!=0) {
                d[i] = d[k]*d[k];
            }
            for (int j=1; j<=k; j++){
                d[i] += 2*(d[i-j]*d[j-1]);
               
            }
        
        }
        return d[n];
    }
}
