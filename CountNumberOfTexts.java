//2266. Count Number of Texts
class Solution {

    public int countTexts(String pressedKeys) {
       int M = 1000000007;
        int[] dp = new int[pressedKeys.length()];
        for (int i = 0; i < pressedKeys.length(); i++) {
            char c = pressedKeys.charAt(i);
            int k = (c=='7'||c=='9') ? 3 : 2;
            dp[i] = ((i>0) ? dp[i-1] : 1)%M;
            for (int j = 1; j <=k; j++) {
                if (i-j -1 >= 0 && pressedKeys.charAt(i-j)==c) {
                    dp[i] = (dp[i] + ((i-j-1>=0)? dp[i-j-1] : 0))%M;
                } else if (i-j-1==-1 && pressedKeys.charAt(i-j)==c) {
                    dp[i] = (dp[i] + 1)%M;
                    break;
                } else {
                    break;
                }

            }

        }     
        return dp[pressedKeys.length()-1];
    }    
}
