package _802_Find_Eventual_Safe_States;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void eventualSafeNodes() {
        assertEquals(Arrays.asList(2, 4, 5, 6), SOLUTION.eventualSafeNodes(new int[][]{{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}}));
    }

}