package _820_Short_Encoding_of_Words;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void minimumLengthEncoding() {
        assertEquals(10, SOLUTION.minimumLengthEncoding(new String[]{"time", "me", "bell"}));
    }

}