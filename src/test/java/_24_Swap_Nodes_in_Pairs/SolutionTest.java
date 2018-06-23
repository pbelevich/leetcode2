package _24_Swap_Nodes_in_Pairs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void swapPairs() {
        assertNull(SOLUTION.swapPairs(null));
        assertEquals(l(1), SOLUTION.swapPairs(l(1)));
        assertEquals(l(2, l(1)), SOLUTION.swapPairs(l(1, l(2))));
        assertEquals(l(2, l(1, l(3))), SOLUTION.swapPairs(l(1, l(2, l(3)))));
        assertEquals(l(2, l(1, l(4, l(3)))), SOLUTION.swapPairs(l(1, l(2, l(3, l(4))))));
        assertEquals(l(2, l(1, l(4, l(3, l(5))))), SOLUTION.swapPairs(l(1, l(2, l(3, l(4, l(5)))))));
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