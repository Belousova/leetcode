//1652. Defuse the Bomb  
class Solution {
    public int[] decrypt(int[] code, int k) {
        
        int[] res = new int[code.length];
        if (k==0) return res;
        
        int start = 1;
        int end = k;
        if (k<0) {
            k = -k;
            end = code.length-1;
            start = code.length - k;
        }
        int s = 0;
        for (int i=start; i<=end; i++) {
            s+=code[i];
        }
        for (int i=0; i<code.length; i++){
            res[i] = s;
            s+= code[(++end)%code.length];
            s-= code[(start++)%code.length];
        }
        return res;
    }
}
