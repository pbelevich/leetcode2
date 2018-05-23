package _118_Pascals_Triangle;

import org.junit.Test;

import java.util.Collections;

import static java.util.Arrays.*;
import static java.util.Collections.singletonList;
import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void generate() {
        assertEquals(Collections.emptyList(), SOLUTION.generate(0));
        assertEquals(singletonList(singletonList(1)), SOLUTION.generate(1));
        assertEquals(asList(singletonList(1), asList(1, 1), asList(1, 2, 1), asList(1, 3, 3, 1), asList(1, 4, 6, 4, 1)), SOLUTION.generate(5));
    }

}