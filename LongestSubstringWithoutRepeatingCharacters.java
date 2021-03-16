//3. Longest Substring Without Repeating Characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
      if (s.isEmpty()) return 0;
        int start = 0;
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < s.length(); end++){
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(map.get(s.charAt(end))+1, start);
            }
            map.put(s.charAt(end), end);
            
            res = Math.max(res, end-start+1);
        }
        return res;
    }
}
