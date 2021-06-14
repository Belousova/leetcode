//720. Longest Word in Dictionary
/**
 * Given an array of strings words representing an English Dictionary, return the longest word in words that can be built one character at a time by other words in words.
 * 
 * If there is more than one possible answer, return the longest word with the smallest lexicographical order. If there is no answer, return the empty string.
 * 
**/
/** Using Trie
 class Trie {
    Trie[] mapping = new Trie[26];
    boolean isWord;
    
    public void insert(String word) {
        Trie node = this;
        for (char c: word.toCharArray()) {
            if (node.mapping[c - 'a'] == null) {
                node.mapping[c - 'a'] = new Trie();
            }
            node = node.mapping[c - 'a'];
        }
        node.isWord = true;
    }
    
    public boolean hasPrev(String word) {
        Trie node = this;
        for (char c: word.toCharArray()) {
            if (node.mapping[c - 'a'] == null) {
                return false;
            }
            node = node.mapping[c - 'a'];
            if (!node.isWord) {
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Trie t = new Trie();
        String ans = "";
        for (String s: words) {
            t.insert(s);
            if (t.hasPrev(s)) {
                if (s.length() > ans.length()) {
                    ans = s;
                }
            }
        }
        return ans;
    }
}
**/
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String ans = "";
        Set<String> set = new HashSet<String>();
        for (String w : words) {
            if (w.length() == 1 || set.contains(w.substring(0, w.length()-1))) {
                if (ans.length() < w.length()) {
                    ans = w;
                }
                set.add(w);
            }   
            
        }
        return ans;
    }
}
