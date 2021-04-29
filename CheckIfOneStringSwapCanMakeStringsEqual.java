//1790. Check if One String Swap Can Make Strings Equal
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        int i1 = -1;
        int i2 = -1;
        for (int i=0; i<s1.length(); i++){
            if (s1.charAt(i)!=s2.charAt(i)){
                if (i1==-1) {
                    i1 = i;
                } else if (i2==-1) {
                    i2 = i;
                } else {
                    return false;
                }
            }           
        }
        if (i1==-1 && i2 ==-1) {
            return true;
        }
        if (i1!=-1 && i2!=-1 && s1.charAt(i1)==s2.charAt(i2) && s1.charAt(i2) == s2.charAt(i1)) {
            return true;
        } else {
            return false;
        }
    }
}
