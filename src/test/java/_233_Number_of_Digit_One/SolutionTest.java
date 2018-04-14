package _233_Number_of_Digit_One;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void countDigitOne() {
        for (int n = 1; n <= 10000; n++) {
            assertEquals(countDigitOne(n), SOLUTION.countDigitOne(n));
        }
    }

    int countDigitOne(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j /= 10) {
                if (j % 10 == 1) {
                    result++;
                }
            }
        }
        return result;
    }

}