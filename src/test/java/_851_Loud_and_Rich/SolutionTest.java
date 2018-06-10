package _851_Loud_and_Rich;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void loudAndRich() {
        assertArrayEquals(new int[]{5, 5, 2, 5, 4, 5, 6, 7}, SOLUTION.loudAndRich(
                new int[][]{{1, 0}, {2, 1}, {3, 1}, {3, 7}, {4, 3}, {5, 3}, {6, 3}},
                new int[]{3, 2, 5, 4, 6, 1, 7, 0}
        ));
    }

}