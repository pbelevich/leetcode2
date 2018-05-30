package _220_Contains_Duplicate_III;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void containsNearbyAlmostDuplicate() {
        assertTrue(SOLUTION.containsNearbyAlmostDuplicate(new int[]{1, 2, 3, 1}, 4, 0));
        assertTrue(SOLUTION.containsNearbyAlmostDuplicate(new int[]{1, 0, 1, 1}, 1, 0));
        assertFalse(SOLUTION.containsNearbyAlmostDuplicate(new int[]{4, 2}, 2, 1));
        assertFalse(SOLUTION.containsNearbyAlmostDuplicate(new int[]{-1, -1}, 1, -1));
        assertTrue(SOLUTION.containsNearbyAlmostDuplicate(new int[]{0, 2147483647}, 1, 2147483647));
        assertFalse(SOLUTION.containsNearbyAlmostDuplicate(new int[]{1, 2}, 0, 1));
        assertTrue(SOLUTION.containsNearbyAlmostDuplicate(new int[]{2, 1}, 1, 1));
    }

}