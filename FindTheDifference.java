//389. Find the Difference
class Solution {
    public char findTheDifference(String s, String t) {
        
        char ans = t.charAt(t.length()-1);
        
        for (int i=0; i<s.length(); i++) {
            ans ^= s.charAt(i) ^ t.charAt(i);
        }
        
        return (char)ans;
     
    }
}
