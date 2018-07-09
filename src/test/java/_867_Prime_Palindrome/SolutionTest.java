package _867_Prime_Palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void primePalindrome() {
        assertEquals(101, SOLUTION.primePalindrome(13));
        assertEquals(2, SOLUTION.primePalindrome(1));
        assertEquals(11, SOLUTION.primePalindrome(8));
    }

    @Test
    public void primePalindromeLarge() {
        assertEquals(9286829, SOLUTION.primePalindrome(9280830));
        assertEquals(100030001, SOLUTION.primePalindrome(51633903));
    }

    @Test
    public void reverse() {
        assertEquals(1, Solution.reverse(1));
        assertEquals(1, Solution.reverse(10));
        assertEquals(321, Solution.reverse(123));
    }

    @Test
    public void isPrime() {
        assertFalse(Solution.isPrime(0));
        assertFalse(Solution.isPrime(1));
        assertTrue(Solution.isPrime(2));
        assertTrue(Solution.isPrime(3));
        assertFalse(Solution.isPrime(4));
        assertTrue(Solution.isPrime(5));
        assertFalse(Solution.isPrime(6));
        assertTrue(Solution.isPrime(7));
        assertFalse(Solution.isPrime(8));
        assertFalse(Solution.isPrime(9));
        assertFalse(Solution.isPrime(10));
        assertTrue(Solution.isPrime(11));
    }

}