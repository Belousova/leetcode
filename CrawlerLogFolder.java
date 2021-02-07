//1598. Crawler Log Folder
class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<String>();
        for (int i=0; i<logs.length; i++) {
            if (logs[i].equals("../")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (!logs[i].equals("./")) {
                st.push(logs[i]);
            }
        }
        return st.size();
    }
}
