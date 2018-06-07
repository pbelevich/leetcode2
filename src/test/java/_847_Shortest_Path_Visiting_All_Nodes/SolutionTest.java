package _847_Shortest_Path_Visiting_All_Nodes;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void shortestPathLength() {
        assertEquals(4, SOLUTION.shortestPathLength(new int[][]{{1, 2, 3}, {0}, {0}, {0}}));
        assertEquals(4, SOLUTION.shortestPathLength(new int[][]{{1}, {0, 2, 4}, {1, 3, 4}, {2}, {1, 2}}));
    }

}