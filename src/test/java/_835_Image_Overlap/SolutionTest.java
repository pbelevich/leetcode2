package _835_Image_Overlap;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void largestOverlap() {
        assertEquals(3, SOLUTION.largestOverlap(new int[][]{
                {1, 1, 0},
                {0, 1, 0},
                {0, 1, 0}
        }, new int[][]{
                {0, 0, 0},
                {0, 1, 1},
                {0, 0, 1}
        }));
    }

}