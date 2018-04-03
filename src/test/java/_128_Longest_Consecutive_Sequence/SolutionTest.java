package _128_Longest_Consecutive_Sequence;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void longestConsecutive() {
        assertEquals(0, SOLUTION.longestConsecutive(new int[]{}));
        assertEquals(4, SOLUTION.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}