package _329_Longest_Increasing_Path_in_a_Matrix;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void longestIncreasingPath() {
        assertEquals(5, SOLUTION.longestIncreasingPath(new int[][]{
                {1, 1, 3},
                {3, 2, 2},
                {4, 5, 1}
        }));
        assertEquals(4, SOLUTION.longestIncreasingPath(new int[][]{
                {9, 9, 4},
                {6, 6, 8},
                {4, 5, 1}
        }));
        assertEquals(4, SOLUTION.longestIncreasingPath(new int[][]{
                {3, 4, 5},
                {3, 2, 6},
                {2, 2, 1}
        }));
        assertEquals(0, SOLUTION.longestIncreasingPath(new int[][]{}));
    }

}