package _139_Word_Break;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void wordBreak() {
        assertTrue(SOLUTION.wordBreak("leetcode", Arrays.asList("leet", "code")));
        assertTrue(SOLUTION.wordBreak("applepenapple", Arrays.asList("apple", "pen")));
        assertFalse(SOLUTION.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }

}