//2305. Fair Distribution of Cookies
class Solution {
    int ans = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        int[] ch = new int[k];
        int index = 0;
        helper(cookies, ch, index);
        return ans;
    }
    public void helper(int[] cookies, int[] ch, int index){
        if (index == cookies.length) {
            int v = 0;
            for (int i = 0; i < ch.length; i++) {
                v = Math.max(v, ch[i]);
            }
            ans = Math.min(ans, v);
            return;
        }
        for (int i = 0; i < ch.length; i++) {
            ch[i]+=cookies[index];
            index++;
            helper(cookies, ch, index);
            index--;
            ch[i]-=cookies[index];

        }
       return;
      }
} 
