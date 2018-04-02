package _273_Integer_to_English_Words;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void numberToWords() {
        assertEquals("Zero", SOLUTION.numberToWords(0));
        assertEquals("Five", SOLUTION.numberToWords(5));
        assertEquals("Ten", SOLUTION.numberToWords(10));
        assertEquals("Fifteen", SOLUTION.numberToWords(15));
        assertEquals("Fifty Five", SOLUTION.numberToWords(55));
        assertEquals("One Hundred", SOLUTION.numberToWords(100));
        assertEquals("One Hundred Twenty Three", SOLUTION.numberToWords(123));
        assertEquals("One Thousand", SOLUTION.numberToWords(1000));
        assertEquals("One Thousand One", SOLUTION.numberToWords(1001));
        assertEquals("Twelve Thousand Three Hundred Forty Five", SOLUTION.numberToWords(12345));
        assertEquals("One Million", SOLUTION.numberToWords(1000000));
        assertEquals("One Million One", SOLUTION.numberToWords(1000001));
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", SOLUTION.numberToWords(1234567));
        assertEquals("Fifty Thousand Eight Hundred Sixty Eight", SOLUTION.numberToWords(50868));
    }

}