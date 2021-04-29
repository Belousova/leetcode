//1347. Minimum Number of Steps to Make Two Strings Anagram
class Solution {
    public int minSteps(String s, String t) {
        int[] ch= new int[26];
        for (int i=0; i<s.length(); i++) {
            ch[s.charAt(i) - 'a']++;
            ch[t.charAt(i) - 'a']--;
        }
        int count_pos = 0;
        for (int i=0; i<ch.length; i++) {
            if (ch[i]>0) {
                count_pos+=ch[i];
            }
        }
        return count_pos;
    }
}
