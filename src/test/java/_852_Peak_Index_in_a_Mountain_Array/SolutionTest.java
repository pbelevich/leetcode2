package _852_Peak_Index_in_a_Mountain_Array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void peakIndexInMountainArray() {
        assertEquals(1, SOLUTION.peakIndexInMountainArray(new int[]{0, 1, 0}));
        assertEquals(1, SOLUTION.peakIndexInMountainArray(new int[]{0, 2, 1, 0}));
    }

}