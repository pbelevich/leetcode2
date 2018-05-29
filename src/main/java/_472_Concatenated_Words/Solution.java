package _472_Concatenated_Words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Node {

        String word;
        Node[] kids = new Node['z' - 'a' + 1];

        boolean insert(char[] chars, int i, String word, Node root) {
            final char c = chars[i];
            Node kid = kids[c - 'a'];
            if (kid == null) {
                kid = new Node();
                kids[c - 'a'] = kid;
            }

            if (kid.word != null && root.find(chars, i + 1, root)) {
                return false;
            }

            if (i == chars.length - 1) {
                kid.word = word;
                return true;
            } else {
                return kid.insert(chars, i + 1, word, root);
            }
        }

        boolean find(char[] chars, int i, Node root) {
            final char c = chars[i];
            Node kid = kids[c - 'a'];
            if (kid == null) {
                return false;
            }

            if (kid.word != null && (i == chars.length - 1 || root.find(chars, i + 1, root))) {
                return true;
            }

            if (i == chars.length - 1) {
                return kid.word != null;
            } else {
                return kid.find(chars, i + 1, root);
            }
        }

    }

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Integer[] indices = new Integer[words.length];
        for (int i = 0; i < words.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return Integer.compare(words[i1].length(), words[i2].length());
            }
        });

        Node root = new Node();

        List<Integer> result = new ArrayList<>();
        for (int i : indices) {
            final String word = words[i];
            if (word != null && !word.isEmpty() && !root.insert(word.toCharArray(), 0, word, root)) {
                result.add(i);
            }
        }
        Collections.sort(result);

        List<String> res = new ArrayList<>();
        for (int i : result) {
            res.add(words[i]);
        }

        return res;
    }

}
