//392. Is Subsequence
class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;
        for (int i=0; i<s.length(); i++){
            idx = t.indexOf(s.charAt(i), idx);
            if (idx==-1) return false;
            idx++;
        }
        return true;
    }
}