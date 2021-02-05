//290. Word Pattern
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] str = s.split(" ");
        if (pattern.length()!=str.length) {
            return false;
        }
        HashMap map = new HashMap();
        for (int i=0; i<pattern.length(); i++) {
            
            if (!map.containsKey(pattern.charAt(i))) {
                map.put(pattern.charAt(i),i);
            }
            if (!map.containsKey(str[i])) {
                map.put(str[i],i);
            }
            if ((int)map.get(pattern.charAt(i))!=(int)map.get(str[i])){
                return false;
            }
        }
        return true;
    }
}
