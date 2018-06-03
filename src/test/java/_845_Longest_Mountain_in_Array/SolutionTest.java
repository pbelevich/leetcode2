package _845_Longest_Mountain_in_Array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void longestMountain() {
        assertEquals(5, SOLUTION.longestMountain(new int[]{2, 1, 4, 7, 3, 2, 5}));
        assertEquals(0, SOLUTION.longestMountain(new int[]{2, 2, 2}));
        assertEquals(0, SOLUTION.longestMountain(new int[]{2, 3}));
        assertEquals(3, SOLUTION.longestMountain(new int[]{0, 1, 0}));
        assertEquals(4, SOLUTION.longestMountain(new int[]{875, 884, 239, 731, 723, 685}));
    }

}