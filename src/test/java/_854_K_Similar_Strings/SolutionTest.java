package _854_K_Similar_Strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void kSimilarity1() {
        assertEquals(1, SOLUTION.kSimilarity("ab", "ba"));
        assertEquals(2, SOLUTION.kSimilarity("abc", "bca"));
        assertEquals(2, SOLUTION.kSimilarity("abac", "baca"));
        assertEquals(2, SOLUTION.kSimilarity("aabc", "abca"));
    }

    @Test
    public void kSimilarity2() {
        assertEquals(6, SOLUTION.kSimilarity("aabbccddee", "cdacbeebad"));
    }

    @Test
    public void kSimilarity3() {
        assertEquals(9, SOLUTION.kSimilarity("abccaacceecdeea", "bcaacceeccdeaae"));
    }

}