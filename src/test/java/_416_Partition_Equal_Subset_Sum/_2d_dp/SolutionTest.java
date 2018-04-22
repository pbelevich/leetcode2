package _416_Partition_Equal_Subset_Sum._2d_dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void canPartition() {
        assertTrue(SOLUTION.canPartition(new int[]{1, 5, 11, 5}));
        assertFalse(SOLUTION.canPartition(new int[]{1, 2, 3, 5}));
    }

}