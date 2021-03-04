//455. Assign Cookies
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int gidx = g.length-1;
        int sidx = s.length-1;
        while (gidx>=0 && sidx>=0){
            if (g[gidx]>s[sidx]) {
                gidx--;
            } else {
                res++;
                gidx--;
                sidx--;
            }
        }
        return res;
    }
}
