package _843_Guess_the_Word;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private final Random r = new Random();

    public void findSecretWord(String[] words, Master master) {
        List<char[]> wordList = new ArrayList<>(words.length);
        for (String word : words) {
            wordList.add(word.toCharArray());
        }
        while (true) {
            char[] candidate = wordList.get(r.nextInt(wordList.size()));
            final int guess = master.guess(new String(candidate));
            assert guess != -1;
            if (guess == 6) {
                return;
            } else if (guess == 0) {
                for (int i = 0; i < 6; i++) {
                    for (Iterator<char[]> it = wordList.iterator(); it.hasNext(); ) {
                        char[] word = it.next();
                        if (word[i] == candidate[i]) {
                            it.remove();
                        }
                    }
                }
            } else {
                final int dist = 6 - guess;
                wordList.remove(candidate);
                for (Iterator<char[]> it = wordList.iterator(); it.hasNext(); ) {
                    char[] word = it.next();
                    if (dist(candidate, word) > dist) {
                        it.remove();
                    }
                }
            }
        }
    }

    private int dist(char[] candidate, char[] word) {
        int dist = 0;
        for (int i = 0; i < 6; i++) {
            if (candidate[i] != word[i]) {
                dist++;
            }
        }
        return dist;
    }

}
