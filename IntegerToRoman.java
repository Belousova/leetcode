//12. Integer to Roman
class Solution {
    public String intToRoman(int num) {
        // 1<=num<=3999
        // I<=num<=MMMCMXCIX
        StringBuilder sb = new StringBuilder();
        int[] values = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] str = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i=0; i<values.length; i++) {
            while (num>=values[i]) {
                sb.append(str[i]);
                num -= values[i];
            }
        }
        return sb.toString();
        
    }
}
