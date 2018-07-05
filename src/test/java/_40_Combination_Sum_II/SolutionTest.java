package _40_Combination_Sum_II;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void combinationSum2() {
        assertEquals(asList(asList(1, 1, 6), asList(1, 2, 5), asList(1, 7), asList(2, 6)), SOLUTION.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
        assertEquals(asList(asList(1, 2, 2), asList(5)), SOLUTION.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5));
        assertEquals(asList(asList(1, 1, 1, 5), asList(1, 1, 3, 3), asList(3, 5)), SOLUTION.combinationSum2(new int[]{3, 1, 3, 5, 1, 1}, 8));
    }

}