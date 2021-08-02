//1128. Number of Equivalent Domino Pairs
/**
 * Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either (a==c and b==d), or (a==d and b==c) - that is, one domino can be rotated to be equal to another domino.
 *
 * Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].
 **/
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[][] all = new int[10][10];
        int cnt = 0;
        all[dominoes[0][0]][dominoes[0][1]] = 1;
        all[dominoes[0][1]][dominoes[0][0]] = 1;
        for (int i = 1; i < dominoes.length; i++) {
            int n = dominoes[i][0];
            int m = dominoes[i][1];
            if (all[n][m] > 0) {
                cnt += all[n][m];
            }
            all[n][m]++;
            if (n!=m) {
                all[m][n]++;
            }
        }
        return cnt;
    }
}
