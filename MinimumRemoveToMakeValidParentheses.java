//1249. Minimum Remove to Make Valid Parentheses
class Solution {
    public String minRemoveToMakeValid(String s) {
        
        List<Integer> idx_open = new ArrayList<>();
        List<Integer> idx_close = new ArrayList<>();
        
        for (int i=0; i<s.length(); i++ ){
            if (s.charAt(i) == ')') {
                if (idx_open.size()>0) {
                    idx_open.remove(idx_open.size()-1);
                } else {
                    idx_close.add(i);
                }        
            }
            if (s.charAt(i) == '(') {
                idx_open.add(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (idx_open.size()>0 || idx_close.size()>0) {
            int id_open = 0;
            int id_close = 0;
            for (int i = 0; i<s.length(); i++) {
                if (s.charAt(i) == '(') {
                    if (id_open < idx_open.size()) {
                        if (idx_open.get(id_open) == i) {
                            id_open++;
                        } else {
                            sb.append(s.charAt(i));
                        }
                    } else {
                        sb.append(s.charAt(i));
                    }
                } else if (s.charAt(i) == ')') {
                    if (id_close < idx_close.size()) {
                        if (idx_close.get(id_close) == i) {
                            id_close++;
                        } else {
                            sb.append(s.charAt(i));
                        }
                    } else {
                        sb.append(s.charAt(i));
                    }
                    
                } else {
                    sb.append(s.charAt(i));
                }
            }
        } else {
            return s;
        }
        return sb.toString();
    }
}
