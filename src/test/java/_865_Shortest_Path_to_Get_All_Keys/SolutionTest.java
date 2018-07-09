package _865_Shortest_Path_to_Get_All_Keys;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void shortestPathAllKeys1() {
        assertEquals(8, SOLUTION.shortestPathAllKeys(new String[]{
                "@.a.#",
                "###.#",
                "b.A.B"
        }));
    }

    @Test
    public void shortestPathAllKeys2() {
        assertEquals(6, SOLUTION.shortestPathAllKeys(new String[]{
                "@..aA",
                "..B#.",
                "....b"
        }));
    }

    @Test
    public void shortestPathAllKeys3() {
        assertEquals(-1, SOLUTION.shortestPathAllKeys(new String[]{
                "@.A.a",
        }));
    }

    @Test
    public void shortestPathAllKeys4() {
        assertEquals(19, SOLUTION.shortestPathAllKeys(new String[]{
                "..#....##.",
                "....d.#.D#",
                "#...#.c...",
                "..##.#..a.",
                "...#....##",
                "#....b....",
                ".#..#.....",
                "..........",
                ".#..##..A.",
                ".B..C.#..@",
        }));
    }

}