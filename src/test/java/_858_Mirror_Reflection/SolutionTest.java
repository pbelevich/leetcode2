package _858_Mirror_Reflection;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void mirrorReflection() {
        assertEquals(1, SOLUTION.mirrorReflection(1, 1));
        assertEquals(2, SOLUTION.mirrorReflection(2, 1));
        assertEquals(0, SOLUTION.mirrorReflection(1, 2));
        assertEquals(1, SOLUTION.mirrorReflection(2, 2));
    }

}