package _532_K_diff_Pairs_in_an_Array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void findPairs() {
        assertEquals(2, SOLUTION.findPairs(new int[]{3, 1, 4, 1, 5}, 2));
        assertEquals(4, SOLUTION.findPairs(new int[]{1, 2, 3, 4, 5}, 1));
        assertEquals(1, SOLUTION.findPairs(new int[]{1, 3, 1, 5, 4}, 0));
        assertEquals(0, SOLUTION.findPairs(new int[]{1, 2, 3, 4, 5}, -1));
        assertEquals(1, SOLUTION.findPairs(new int[]{1, 1, 1, 1, 1}, 0));
    }

}