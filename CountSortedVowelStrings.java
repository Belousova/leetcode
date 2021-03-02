//1641. Count Sorted Vowel Strings
class Solution {
    public int countVowelStrings(int n) {

        int[] d = new int[]{1,1,1,1,1};
        int[] tmp = new int[5];
        for (int i=2; i<=n; i++){
            
            tmp[0] = d[0];
            tmp[1] = d[1];
            tmp[2] = d[2];
            tmp[3] = d[3];
            tmp[4] = d[4];
            for (int j=0; j<5; j++){
                for (int k=j+1; k<5; k++) {
                    tmp[k] = tmp[k] + d[j];
                }
            }
            d[0] = tmp[0];
            d[1] = tmp[1];
            d[2] = tmp[2];
            d[3] = tmp[3];
            d[4] = tmp[4];
            
        }
        return getSum(d);
    }
    private int getSum(int[] a){
        int s = 0;
        for (int i:a) {
            s+=i;
        }
        return s;
    }
}
