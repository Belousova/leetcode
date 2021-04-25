//423. Reconstruct Original Digits from English
class Solution {
    public String originalDigits(String s) {
    /*
     o - (zero, one, two, four)
    g - (eight)
    f - four, five
    i - five, six, eight, nine
    h - three, eight
    s - six, seven
    u - four
    t - two, three, eight
    v - five, seven
    x - six
    w - 1 (two)
    z - 1 (zero)
    t - 1 (two, three, eight)
    n - 1 (one, seven, nine)
    e - 2 (zero, one, three, five, seven, eight, nine)
    r - 1 (zero, three, four)
    zero - z
    one - 
    two - w
    three -
    four - u
    five - 
    six - x
    seven - 
    eight - g
    nine - 
    */
        int[] d = new int[10];
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c=='g') d[8]++;
            if (c=='f') d[5]++;
            if (c=='z') d[0]++;
            if (c=='w') d[2]++;
            if (c=='u') d[4]++;
            if (c=='x') d[6]++;
            if (c=='o') d[1]++;
            if (c=='t') d[3]++;
            if (c=='s') d[7]++;
            if (c=='i') d[9]++;
            
        }
        d[1] = d[1] - d[0] - d[4] - d[2];        
        d[3] = d[3] - d[2] - d[8];
        d[5] -= d[4];
        d[7] -= d[6];
        d[9] = d[9] - d[5] - d[6] - d[8];
                    
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<=9; i++){
            for (int j=0; j<d[i]; j++) {
                sb.append(Integer.toString(i));
            }
        }
        
        
        return sb.toString();
    }
}
