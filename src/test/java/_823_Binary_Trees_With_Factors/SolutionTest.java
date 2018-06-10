package _823_Binary_Trees_With_Factors;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void numFactoredBinaryTrees() {
        assertEquals(3, SOLUTION.numFactoredBinaryTrees(new int[]{2, 4}));
        assertEquals(7, SOLUTION.numFactoredBinaryTrees(new int[]{2, 4, 5, 10}));
        assertEquals(777, SOLUTION.numFactoredBinaryTrees(new int[]{45, 42, 2, 18, 23, 1170, 12, 41, 40, 9, 47, 24, 33, 28, 10, 32, 29, 17, 46, 11, 759, 37, 6, 26, 21, 49, 31, 14, 19, 8, 13, 7, 27, 22, 3, 36, 34, 38, 39, 30, 43, 15, 4, 16, 35, 25, 20, 44, 5, 48}));
    }

}