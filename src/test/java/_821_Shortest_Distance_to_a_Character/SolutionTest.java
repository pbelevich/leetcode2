package _821_Shortest_Distance_to_a_Character;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void shortestToChar() {
        assertArrayEquals(new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}, SOLUTION.shortestToChar("loveleetcode", 'e'));
    }

}