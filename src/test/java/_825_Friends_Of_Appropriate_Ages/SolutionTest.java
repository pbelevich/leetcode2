package _825_Friends_Of_Appropriate_Ages;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void numFriendRequests() {
        assertEquals(2, SOLUTION.numFriendRequests(new int[]{16, 16}));
        assertEquals(2, SOLUTION.numFriendRequests(new int[]{16, 17, 18}));
        assertEquals(3, SOLUTION.numFriendRequests(new int[]{20, 30, 100, 110, 120}));
        assertEquals(29, SOLUTION.numFriendRequests(new int[]{6, 6, 15, 26, 30, 35, 39, 46, 60, 71, 73, 100, 106, 110, 112}));
    }

}