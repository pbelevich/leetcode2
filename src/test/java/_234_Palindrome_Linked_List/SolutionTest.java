package _234_Palindrome_Linked_List;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void isPalindrome() {
        assertTrue(SOLUTION.isPalindrome(null));
        assertTrue(SOLUTION.isPalindrome(l(1)));
        assertTrue(SOLUTION.isPalindrome(l(2, l(2))));
        assertTrue(SOLUTION.isPalindrome(l(1, l(2, l(1)))));
        assertTrue(SOLUTION.isPalindrome(l(1, l(2, l(2, l(1))))));
        assertTrue(SOLUTION.isPalindrome(l(1, l(2, l(3, l(2, l(1)))))));

        assertFalse(SOLUTION.isPalindrome(l(1, l(2))));
        assertFalse(SOLUTION.isPalindrome(l(1, l(2, l(3)))));
        assertFalse(SOLUTION.isPalindrome(l(1, l(2, l(3, l(1))))));
        assertFalse(SOLUTION.isPalindrome(l(1, l(2, l(3, l(3, l(1)))))));
    }

    ListNode l(int val, ListNode next) {
        final ListNode result = new ListNode(val);
        result.next = next;
        return result;
    }

    ListNode l(int val) {
        return l(val, null);
    }

}