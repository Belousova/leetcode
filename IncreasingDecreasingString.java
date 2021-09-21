//1370. Increasing Decreasing String
/** Given a string s. You should re-order the string using the following algorithm:

 * Pick the smallest character from s and append it to the result.
 * Pick the smallest character from s which is greater than the last appended character to the result and append it.
 * Repeat step 2 until you cannot pick more characters.
 * Pick the largest character from s and append it to the result.
 * Pick the largest character from s which is smaller than the last appended character to the result and append it.
 * Repeat step 5 until you cannot pick more characters.
 * Repeat the steps from 1 to 6 until you pick all characters from s.
 * In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append it to the result.

 * Return the result string after sorting s with this algorithm.
**/
class Solution {
    public String sortString(String s) {
        if (s.length()==0) return s;
        StringBuilder sb = new StringBuilder();
        int[] map = new int[26];
        for (char c: s.toCharArray()) {
            map[c - 'a']++;
        }
        boolean asc = true;
        while (sb.length() < s.length()) {
            if (asc) {
                for (int i=0; i < map.length; i++) {
                    if (map[i] > 0) {
                        sb.append((char)(i + 'a'));
                        map[i]--;
                    }
                }
            } else {
                for (int i = map.length-1; i>=0; i--) {
                    if (map[i] > 0) {
                        sb.append((char)(i + 'a'));
                        map[i]--;
                    }
                }
            }
            asc = !asc;
        }
        return sb.toString();
    }
}
