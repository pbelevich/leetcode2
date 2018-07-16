package _200_Number_of_Islands.dfs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void numIslands0() {
        assertEquals(0, SOLUTION.numIslands(null));
        assertEquals(0, SOLUTION.numIslands(new char[0][0]));
        assertEquals(0, SOLUTION.numIslands(new char[1][0]));
    }

    @Test
    public void numIslands1() {
        assertEquals(1, SOLUTION.numIslands(new char[][]{
                "11110".toCharArray(),
                "11010".toCharArray(),
                "11000".toCharArray(),
                "00000".toCharArray()
        }));
    }

    @Test
    public void numIslands2() {
        assertEquals(3, SOLUTION.numIslands(new char[][]{
                "11000".toCharArray(),
                "11000".toCharArray(),
                "00100".toCharArray(),
                "00011".toCharArray()
        }));
    }

}