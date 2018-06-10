package _831_Masking_Personal_Information;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void maskPII() {
        assertEquals("l*****e@leetcode.com", SOLUTION.maskPII("LeetCode@LeetCode.com"));
        assertEquals("a*****b@qq.com", SOLUTION.maskPII("AB@qq.com"));
        assertEquals("***-***-7890", SOLUTION.maskPII("1(234)567-890"));
        assertEquals("+**-***-***-5678", SOLUTION.maskPII("86-(10)12345678"));
    }

}