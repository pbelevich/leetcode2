package _300_Longest_Increasing_Subsequence;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void lengthOfLIS() {
        assertEquals(4, SOLUTION.lengthOfLIS(new int[]{3, 4, -1, 0, 6, 2, 3}));
        assertEquals(4, SOLUTION.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

}