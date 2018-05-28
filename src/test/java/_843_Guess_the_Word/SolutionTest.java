package _843_Guess_the_Word;

import org.junit.Test;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void findSecretWord() {
        final String[] words = {"acckzz", "ccbazz", "eiowzz", "abcczz"};
        SOLUTION.findSecretWord(words, new MasterImpl(words, "acckzz", 10));
    }

}