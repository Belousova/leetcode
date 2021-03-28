//72. Edit Distance
class Solution {
    public int minDistance(String word1, String word2) {
        //dynamic progtramming
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n+1][m+1];
        for (int i=0; i<=n; i++) {
            dp[i][0] = i; 
        }
        for (int j = 0; j<=m; j++) {
            dp[0][j] = j;
        }
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                if (word1.charAt(i-1)==word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) +1;
                }
            }
        }
        return dp[n][m];
    }
    /* recursive with memorization
        Map<String, Integer> map = new HashMap<>();
        return minDist(word1, word2, map);
    }
    public int minDist(String word1, String word2, Map<String, Integer> map){
        
        if (map.containsKey(word1+"-"+word2)) {
            return map.get(word1+"-"+word2);
        }
        if (word1.equals(word2)) {
            map.put(word1+"-"+word2, 0);
            return 0;
        }
        if (word1.isEmpty()) {
            map.put(word1+"-"+word2, word2.length());
            return word2.length();
        }
        if (word2.isEmpty()) {
            map.put(word1+"-"+word2, word1.length());
            return word1.length();
        }
        if (word1.charAt(0)==word2.charAt(0)) {
            int k = minDist(word1.substring(1), word2.substring(1), map); 
            map.put(word1+"-"+word2, k);
            return k;
        } else {
            int k = Math.min(minDist(word2.substring(0,1)+word1, word2, map),
                           Math.min(minDist(word1.substring(1), word2, map),
                           Math.min(minDist(word2.substring(0,1)+word1.substring(1), word2, map),
                           Math.min(minDist(word1, word1.substring(0,1)+word2, map),
                           Math.min(minDist(word1, word2.substring(1), map),
                           minDist(word1, word1.substring(0,1)+word2.substring(1), map)))))) + 1;
            map.put(word1+"-"+word2, k);
            return k;
        }
    }*/
}
