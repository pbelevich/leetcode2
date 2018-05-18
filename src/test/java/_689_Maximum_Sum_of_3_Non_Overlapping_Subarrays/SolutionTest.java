package _689_Maximum_Sum_of_3_Non_Overlapping_Subarrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void maxSumOfThreeSubarrays() {
        assertArrayEquals(new int[]{0, 3, 5}, SOLUTION.maxSumOfThreeSubarrays(new int[]{1, 2, 1, 2, 6, 7, 5, 1}, 2));
    }

    @Test
    public void maxSumOfThreeSubarrays2() {
        assertArrayEquals(new int[]{0, 7, 14}, SOLUTION.maxSumOfThreeSubarrays(new int[]{17, 8, 14, 11, 13, 9, 4, 19, 20, 6, 1, 20, 6, 5, 19, 8, 5, 16, 20, 17}, 5));
    }

}