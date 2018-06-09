package _841_Keys_and_Rooms;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void canVisitAllRooms() {
        assertTrue(SOLUTION.canVisitAllRooms(asList(asList(1), asList(2), asList(3), asList())));
        assertFalse(SOLUTION.canVisitAllRooms(asList(asList(1, 3), asList(3, 0, 1), asList(2), asList(0))));
    }

}