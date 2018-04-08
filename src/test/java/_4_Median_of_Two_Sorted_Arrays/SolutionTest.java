package _4_Median_of_Two_Sorted_Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void findMedianSortedArrays() {
        assertEquals(1, SOLUTION.findMedianSortedArrays(new int[]{1}, new int[]{}), 1e-12);
        assertEquals(1, SOLUTION.findMedianSortedArrays(new int[]{}, new int[]{1}), 1e-12);
        assertEquals(1.5, SOLUTION.findMedianSortedArrays(new int[]{1}, new int[]{2}), 1e-12);
        assertEquals(1.5, SOLUTION.findMedianSortedArrays(new int[]{2}, new int[]{1}), 1e-12);

        assertEquals(3.0, SOLUTION.findMedianSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4}), 1e-12);

        assertEquals(3.5, SOLUTION.findMedianSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6}), 1e-12);
    }
}