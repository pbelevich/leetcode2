package _830_Positions_of_Large_Groups;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void largeGroupPositions() {
        assertEquals(asList(asList(3, 6)), SOLUTION.largeGroupPositions("abbxxxxzzy"));
        assertEquals(asList(), SOLUTION.largeGroupPositions("abc"));
        assertEquals(asList(asList(3, 5), asList(6, 9), asList(12, 14)), SOLUTION.largeGroupPositions("abcdddeeeeaabbbcd"));
    }

}