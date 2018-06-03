package _115_Distinct_Subsequences;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void numDistinct() {
        assertEquals(3, SOLUTION.numDistinct("rabbbit", "rabbit"));
        assertEquals(5, SOLUTION.numDistinct("babgbag", "bag"));
    }

}