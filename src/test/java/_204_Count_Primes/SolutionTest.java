package _204_Count_Primes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void countPrimes() {
        assertEquals(4, SOLUTION.countPrimes(10));
    }

}