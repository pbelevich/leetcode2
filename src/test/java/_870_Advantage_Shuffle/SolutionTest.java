package _870_Advantage_Shuffle;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void advantageCount1() {
        assertArrayEquals(new int[]{2, 11, 7, 15}, SOLUTION.advantageCount(new int[]{2, 7, 11, 15}, new int[]{1, 10, 4, 11}));
    }

    @Test
    public void advantageCount2() {
        assertArrayEquals(new int[]{24, 32, 8, 12}, SOLUTION.advantageCount(new int[]{12, 24, 8, 32}, new int[]{13, 25, 32, 11}));
    }

    @Test
    public void advantageCount3() {
        assertArrayEquals(new int[]{2, 0, 2, 1, 4}, SOLUTION.advantageCount(new int[]{2, 0, 4, 1, 2}, new int[]{1, 3, 0, 0, 2}));
    }

}