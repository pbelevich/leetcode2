package _868_Transpose_Matrix;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void transpose() {
        assertArrayEquals(new int[][]{{1, 3}, {2, 4}}, SOLUTION.transpose(new int[][]{{1, 2}, {3, 4}}));
    }

}