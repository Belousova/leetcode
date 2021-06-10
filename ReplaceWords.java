//648. Replace Words
class Trie {
    Map<Character, Trie> mapping = new HashMap<Character, Trie>();
     
    public void insert(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            if (node.mapping.containsKey('#')) {
                return;
            }
            if (!node.mapping.containsKey(word.charAt(i))) {
                node.mapping.put(word.charAt(i), new Trie());
            }
            node = node.mapping.get(word.charAt(i));
        }
        node.mapping.put('#', new Trie());
    }
    public String findRoot(String word) {
        Trie node = this;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<word.length();i++ ) {
            if (node.mapping.containsKey('#')) {
                return sb.toString();
            }
            if (!node.mapping.containsKey(word.charAt(i))) {
                return "";
            }
            sb.append(word.charAt(i));
            node = node.mapping.get(word.charAt(i));
        }
        return "";
    }
}
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
    //разложить dictionary в trie
    //оставлять только короткие слова
    //в строке искать каждое слово и заменять его на слово из trie
        Trie dict = new Trie();
        for (String s : dictionary) {
            dict.insert(s);
        }
        StringBuilder sb = new StringBuilder();
        String[] ss = sentence.split(" ");
        for (int i = 0; i< ss.length; i++) {
            String r = dict.findRoot(ss[i]);
            if (!r.isEmpty()) {
                sb.append(r);
            } else {
                sb.append(ss[i]);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
