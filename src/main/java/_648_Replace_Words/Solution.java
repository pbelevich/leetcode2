package _648_Replace_Words;

import java.util.List;

import static java.lang.Character.isWhitespace;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Node {

        String word;
        Node[] kids = new Node['z' - 'a' + 1];

        void insert(char[] chars, int i, String word) {
            final char ch = chars[i];
            Node kid = kids[ch - 'a'];
            if (kid == null) {
                kid = new Node();
                kids[ch - 'a'] = kid;
            }

            if (i == chars.length - 1) {
                kid.word = word;
            } else {
                kid.insert(chars, i + 1, word);
            }
        }

    }

    public String replaceWords(List<String> dict, String sentence) {
        Node root = new Node();
        for (String word : dict) {
            root.insert(word.toCharArray(), 0, word);
        }
        final StringBuilder sb = new StringBuilder();
        final char[] chars = sentence.toCharArray();
        for (int i = 0; i < chars.length; ) {
            final char c = chars[i];
            if (isWhitespace(c)) {
                sb.append(c);
                i++;
            } else {
                Node node = root;
                String replace = null;
                int j;
                for (j = i; j < chars.length && !isWhitespace(chars[j]); j++) {
                    node = node != null ? node.kids[chars[j] - 'a'] : null;
                    if (replace == null && node != null && node.word != null) {
                        replace = node.word;
                    }
                }
                if (replace == null) {
                    sb.append(chars, i, j - i);
                } else {
                    sb.append(replace);
                }
                i = j;
            }

        }
        return sb.toString();
    }

}
