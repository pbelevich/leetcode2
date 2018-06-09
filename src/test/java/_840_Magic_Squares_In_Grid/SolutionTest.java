package _840_Magic_Squares_In_Grid;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void numMagicSquaresInside1() {
        assertEquals(1, SOLUTION.numMagicSquaresInside(new int[][]{
                {4, 3, 8, 4},
                {9, 5, 1, 9},
                {2, 7, 6, 2}
        }));
    }

    @Test
    public void numMagicSquaresInside2() {
        assertEquals(0, SOLUTION.numMagicSquaresInside(new int[][]{
                {1, 8, 6},
                {10, 5, 0},
                {4, 2, 9}
        }));
    }


}