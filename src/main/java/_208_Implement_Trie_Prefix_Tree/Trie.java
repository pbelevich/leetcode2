package _208_Implement_Trie_Prefix_Tree;

/**
 * @author Pavel Belevich
 */
public class Trie {

    static class Node {

        final char c;
        boolean end;
        Node[] kids = new Node['z' - 'a' + 1];

        Node(char c) {
            this.c = c;
        }

        void addWord(char[] word, int i) {
            final char ch = word[i];
            Node kid = kids[ch - 'a'];
            if (kid == null) {
                kid = new Node(ch);
                kids[ch - 'a'] = kid;
            }

            if (i == word.length - 1) {
                kid.end = true;
            } else {
                kid.addWord(word, i + 1);
            }
        }

        boolean search(char[] word, int i) {
            final char ch = word[i];
            Node kid = kids[ch - 'a'];
            if (kid == null) {
                return false;
            }
            if (i == word.length - 1) {
                return kid.end;
            } else {
                return kid.search(word, i + 1);
            }
        }

        boolean startsWith(char[] prefix, int i) {
            final char ch = prefix[i];
            Node kid = kids[ch - 'a'];
            if (kid == null) {
                return false;
            }
            if (i == prefix.length - 1) {
                return true;
            } else {
                return kid.startsWith(prefix, i + 1);
            }
        }

    }

    private Node root;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new Node((char) 0);
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        if (word != null && !word.isEmpty()) {
            root.addWord(word.toCharArray(), 0);
        }
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        return word != null && !word.isEmpty() && root.search(word.toCharArray(), 0);
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        return prefix != null && (prefix.isEmpty() || root.startsWith(prefix.toCharArray(), 0));
    }

}
