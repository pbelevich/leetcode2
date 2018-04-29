package _827_Making_A_Large_Island;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void largestIsland() {
        assertEquals(3, new Solution().largestIsland(new int[][]{{1, 0}, {0, 1}}));
        assertEquals(4, new Solution().largestIsland(new int[][]{{1, 1}, {0, 1}}));
        assertEquals(4, new Solution().largestIsland(new int[][]{{1, 1}, {1, 1}}));
        assertEquals(1, new Solution().largestIsland(new int[][]{{1}}));
        assertEquals(1, new Solution().largestIsland(new int[][]{{0}}));
    }

}