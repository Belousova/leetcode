//1832. Check if the Sentence Is Pangram
/** 
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * 
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
**/

class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        for (Character ch = 'a'; ch <='z'; ch++) {
            if (!sentence.contains(String.valueOf(ch))) {
                return false;
            }
        }
        return true;
    }
}
