package _843_Guess_the_Word;

import java.util.Arrays;

/**
 * @author Pavel Belevich
 */
public class MasterImpl implements Master {

    private final String[] words;
    private final int maxAttempts;
    private final String secret;

    private int attempts = 0;

    public MasterImpl(String[] words, String secret, int maxAttempts) {
        this.words = Arrays.copyOf(words, words.length);
        Arrays.sort(this.words);
        this.secret = secret;
        this.maxAttempts = maxAttempts;
    }

    @Override
    public int guess(String candidate) {
        assert attempts++ < maxAttempts;
        if (Arrays.binarySearch(words, candidate) < 0) {
            return -1;
        }
        int dist = 0;
        for (int i = 0; i < 6; i++) {
            if (candidate.charAt(i) != secret.charAt(i)) {
                dist++;
            }
        }
        return 6 - dist;
    }

}
