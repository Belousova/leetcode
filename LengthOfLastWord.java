//58. Length of Last Word
class Solution {
    public int lengthOfLastWord(String s) {
        
    /*    String[] words = s.split( );
        
        if (words.length==0) {
            return 0;
        }
        
        return words[words.length-1].length();*/
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndex;
    }
} 
