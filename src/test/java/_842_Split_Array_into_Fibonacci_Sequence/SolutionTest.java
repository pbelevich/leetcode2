package _842_Split_Array_into_Fibonacci_Sequence;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void splitIntoFibonacci() {
        assertEquals(Arrays.asList(123, 456, 579), SOLUTION.splitIntoFibonacci("123456579"));
        assertEquals(Arrays.asList(1, 1, 2, 3, 5, 8, 13), SOLUTION.splitIntoFibonacci("11235813"));
        assertEquals(Collections.emptyList(), SOLUTION.splitIntoFibonacci("112358130"));
        assertEquals(Collections.emptyList(), SOLUTION.splitIntoFibonacci("0123"));
        assertEquals(Arrays.asList(11, 0, 11, 11), SOLUTION.splitIntoFibonacci("1101111"));
        assertEquals(Collections.emptyList(), SOLUTION.splitIntoFibonacci("214748364721474836422147483641"));
        assertEquals(Arrays.asList(1, 0, 1, 1), SOLUTION.splitIntoFibonacci("1011"));
    }

}