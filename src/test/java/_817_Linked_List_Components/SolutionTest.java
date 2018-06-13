package _817_Linked_List_Components;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void numComponents() {
        assertEquals(2, SOLUTION.numComponents(l(0, l(1, l(2, l(3)))), new int[]{0, 1, 3}));
        assertEquals(2, SOLUTION.numComponents(l(0, l(1, l(2, l(3, l(4))))), new int[]{0, 3, 1, 4}));
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