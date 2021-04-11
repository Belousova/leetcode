//131. Palindrome Partitioning
class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> ans = new ArrayList<>();
        
        if (s.length()==0) {
            List<String> l = new ArrayList<>();
            ans.add(l);
            return ans;
        }
        if (s.length()==1) {
            List<String> l = new ArrayList<>();
            l.add(s);
            ans.add(l);
            return ans;
        }
             
        for (int i=s.length()-1; i>=0; i--){
            String s1 = s.substring(i);
            if (isPalindrome(s1)) {
                List<List<String>> ll = partition(s.substring(0,i));
                for (int j=0; j<ll.size(); j++) {
                    List<String> l = ll.get(j);
                    l.add(s1);
                    ans.add(l);
                }
            }
        }
    
        return ans;
        
    }
    
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while (start < end) {    
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
