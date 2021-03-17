//20. Valid Parentheses
class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c =='[' || c == '{' || c == '(' ) {
                st.push(c);
            }
            if (c == ']') {
                if (st.isEmpty() || st.pop()!='[') {
                    return false;
                }
            }
            if (c == ')') {
                if (st.isEmpty() || st.pop()!='(') {
                    return false;
                }
            }
            if (c == '}') {
                if (st.isEmpty() || st.pop()!='{') {
                    return false;
                }
            }
        }
        return (st.isEmpty());
        
    }
}
