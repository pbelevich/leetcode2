package _657_Judge_Route_Circle;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void judgeCircle() {
        assertTrue(SOLUTION.judgeCircle("UD"));
        assertFalse(SOLUTION.judgeCircle("LL"));
        assertTrue(SOLUTION.judgeCircle("RL"));
        assertFalse(SOLUTION.judgeCircle("DURDLDRRLL"));
    }

}