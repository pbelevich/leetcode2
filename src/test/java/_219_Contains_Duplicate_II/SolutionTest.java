package _219_Contains_Duplicate_II;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void containsNearbyDuplicate() {
        assertTrue(SOLUTION.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        assertTrue(SOLUTION.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        assertFalse(SOLUTION.containsNearbyDuplicate(new int[]{1, 2, 1}, 0));
    }

}