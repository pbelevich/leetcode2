package _848_Shifting_Letters;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void shiftingLetters() {
        assertEquals("rpl", SOLUTION.shiftingLetters("abc", new int[]{3, 5, 9}));
        assertEquals("jyh", SOLUTION.shiftingLetters("bad", new int[]{10, 20, 30}));
    }

}