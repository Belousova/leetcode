//682. Baseball Game
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        for (String s :ops) {
            if (s.equals("+")) {
                int val1 = st.pop();
                int val2 = st.pop();
                st.push(val2);
                st.push(val1);
                st.push(val1+val2);
            } else if (s.equals("D")) {
                int val1 = st.peek();
                st.push(2*val1);
            } else if (s.equals("C")) {
                st.pop();
            } else {
                st.push(Integer.valueOf(s));
            }
        }
        int ans = 0;
        while (!st.isEmpty()) {
            ans+=st.pop();
        }
        return ans;
    }
}
