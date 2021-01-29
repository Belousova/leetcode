//168. Excel Sheet Column Title
class Solution {
    public String convertToTitle(int n) {

        StringBuilder result = new StringBuilder();
        while (n > 0) {
            n--;
            result.append((char)('A' + n % 26));
            n /= 26;
        }
        result.reverse();
        return result.toString();
    }    
}
