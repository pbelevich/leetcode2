package _203_Remove_Linked_List_Elements;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void removeElements() {
        assertEquals(l(1, l(2, l(3))), SOLUTION.removeElements(l(6, l(1, l(2, l(6, l(6, l(3, l(6))))))), 6));
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