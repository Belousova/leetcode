//6. ZigZag Conversion
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int shift = 2*numRows - 2;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<numRows; i++){
            if (i==0 || i==numRows-1) {
                int j = i;
                while (j<s.length()) {
                    sb.append(s.charAt(j));
                    j = j+shift;
                }
            } else {
                int j1 = i;
                int j2 = shift - i;
                while (j1<s.length()||j2<s.length()) {
                    sb.append(s.charAt(j1));
                    if (j2 < s.length()) {
                        sb.append(s.charAt(j2));
                    }
                    j1 += shift;
                    j2 += shift;
                        
                }
            }
        }
        return sb.toString();
    }
}
