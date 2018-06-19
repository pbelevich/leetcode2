package _820_Short_Encoding_of_Words;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Trie {
        Trie[] kids = new Trie[26];
    }

    void insert(Trie curr, char[] chars, int i) {
        for (; i >= 0; curr = next(curr, chars[i--])) ;
    }

    Trie next(Trie trie, char c) {
        return trie.kids[c - 'a'] == null ? trie.kids[c - 'a'] = new Trie() : trie.kids[c - 'a'];
    }

    int size(Trie trie, int prefixLen) {
        int kidsLen = 0;
        for (Trie kid : trie.kids) {
            if (kid != null) {
                kidsLen += size(kid, prefixLen + 1);
            }
        }
        return kidsLen == 0 ? prefixLen + 1 : kidsLen;
    }

    public int minimumLengthEncoding(String[] words) {
        Trie root = new Trie();
        for (String word : words) {
            final char[] chars = word.toCharArray();
            insert(root, chars, chars.length - 1);
        }
        return size(root, 0);
    }

}
