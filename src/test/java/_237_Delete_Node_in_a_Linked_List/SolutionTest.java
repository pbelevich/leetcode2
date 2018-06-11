package _237_Delete_Node_in_a_Linked_List;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void deleteNode() {
        final ListNode l = l(1, l(2, l(3, l(4, l(5)))));
        SOLUTION.deleteNode(l.next.next);
        assertEquals(l(1, l(2, l(4, l(5)))), l);
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