package _838_Push_Dominoes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void pushDominoes() {
        assertEquals("LL.RR.LLRRLL..", SOLUTION.pushDominoes(".L.R...LR..L.."));
        assertEquals("RR.L", SOLUTION.pushDominoes("RR.L"));
        assertEquals("..RRR", SOLUTION.pushDominoes("..R.."));
        assertEquals(".", SOLUTION.pushDominoes("."));
        assertEquals("LLLLLLLLLL", SOLUTION.pushDominoes(".......L.L"));
        assertEquals("RRRR.LLLL.RRRRRRRRRR", SOLUTION.pushDominoes("R.......L.R........."));
    }

}