package _216_Combination_Sum_III;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void combinationSum3() {
        assertEquals(asList(asList(1, 2, 4)), SOLUTION.combinationSum3(3, 7));
        assertEquals(asList(asList(1, 2, 6), asList(1, 3, 5), asList(2, 3, 4)), SOLUTION.combinationSum3(3, 9));
    }

}