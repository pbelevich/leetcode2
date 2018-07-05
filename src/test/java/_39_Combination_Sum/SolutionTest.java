package _39_Combination_Sum;

import org.junit.Test;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void combinationSum() {
        assertEquals(asList(asList(2, 2, 3), asList(7)), SOLUTION.combinationSum(new int[]{2, 3, 6, 7}, 7));
        assertEquals(asList(asList(2, 2, 2, 2), asList(2, 3, 3), asList(3, 5)), SOLUTION.combinationSum(new int[]{2, 3, 5}, 8));
    }

}