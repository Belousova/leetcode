//221. Maximal Square
class Solution {
    public int maximalSquare(char[][] matrix) {
    
        int[] d = new int[matrix[0].length];
        int ans = 0;
        for (int i=0; i<matrix[0].length; i++) {
            d[i] = matrix[0][i]-'0';
            if (ans==0 && d[i]==1) {
                ans = 1;
            } 
        }
        
        
     for (int i=1; i<matrix.length; i++){
            int prev = 0;
            for (int j=0; j<matrix[i].length; j++){
                if (j==0 && matrix[i][j]=='1') {
                    prev = 1;
                }
                if (j>0) {
                    if (matrix[i][j]=='1') {
                        int temp = Math.min(d[j-1],Math.min(d[j],prev)) + 1;
                        d[j-1] = prev;
                        prev = temp;

                    } else {
                        d[j-1] = prev;
                        prev = 0;
                    }

                }
                if (j==matrix[i].length-1){
                    d[j] = prev;
                }

                ans = Math.max(prev, ans);
            }
        }
        return ans*ans;
    }
   
}
