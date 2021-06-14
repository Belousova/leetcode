//1190. Reverse Substrings Between Each Pair of Parentheses
/** You are given a string s that consists of lower case English letters and brackets. 
 *
 * Reverse the strings in each pair of matching parentheses, starting from the innermost one.
 *
 * Your result should not contain any brackets.
 **/
class Solution {
    public String reverseParentheses(String s) {
        if (s.isEmpty()) {
            return "";
        }
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (c == '(') {
                st.push(sb);
                sb = new StringBuilder();
            } else if (c == ')') {
                sb.reverse();
                StringBuilder sb2 = st.pop();
                sb2.append(sb);
                sb = sb2;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
