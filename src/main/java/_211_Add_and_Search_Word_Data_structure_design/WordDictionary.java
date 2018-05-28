package _211_Add_and_Search_Word_Data_structure_design;

/**
 * @author Pavel Belevich
 */
public class WordDictionary {

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
            if (ch == '.') {
                boolean res = false;
                for (Node kid : kids) {
                    if (kid != null) {
                        if (i == word.length - 1) {
                            res |= kid.end;
                        } else {
                            res |= kid.search(word, i + 1);
                        }
                    }
                }
                return res;
            } else {
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
        }

    }

    private Node root;

    /**
     * Initialize your data structure here.
     */
    public WordDictionary() {
        root = new Node((char) 0);
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        if (word != null && !word.isEmpty()) {
            root.addWord(word.toCharArray(), 0);
        }
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return word != null && !word.isEmpty() && root.search(word.toCharArray(), 0);
    }

}
