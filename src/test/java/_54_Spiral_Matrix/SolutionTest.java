package _54_Spiral_Matrix;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void spiralOrder() {
        assertEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5), SOLUTION.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertEquals(Arrays.asList(1, 2, 3), SOLUTION.spiralOrder(new int[][]{{1, 2, 3}}));
        assertEquals(Arrays.asList(1, 2, 3, 6, 5, 4), SOLUTION.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}}));
        assertEquals(Arrays.asList(1, 2, 5, 4), SOLUTION.spiralOrder(new int[][]{{1, 2}, {4, 5}}));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11), SOLUTION.spiralOrder(new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}}));
        assertEquals(Collections.emptyList(), SOLUTION.spiralOrder(new int[][]{}));
    }

}