package _377_Combination_Sum_IV;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void combinationSum4() {
        assertEquals(7, SOLUTION.combinationSum4(new int[]{1, 2, 3}, 4));
    }

}