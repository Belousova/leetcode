//976. Largest Perimeter Triangle
class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i=A.length-1; i>=2; i--){
            if (A[i] < A[i-1] + A[i-2] ) {
                return A[i]+A[i-2]+A[i-1];
            }

        }
        return 0;
    }
}
