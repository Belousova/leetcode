//67. Add Binary
class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder sb = new StringBuilder();
        int m = a.length()-1;
        int n = b.length()-1;
        int carry = 0;
        int sum = 0;
        while (m>=0 || n>=0 || carry>0) {
            sum = carry;
            if (m >= 0) {
                sum += a.charAt(m) - '0';
            }
            if (n >= 0) {
                sum += b.charAt(n) - '0';
            }
            sb.append(sum%2);
            carry = sum/2;
            m--;
            n--;
        }
        return sb.reverse().toString();
    }
}
