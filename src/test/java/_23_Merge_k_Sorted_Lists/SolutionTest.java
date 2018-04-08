package _23_Merge_k_Sorted_Lists;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void mergeKLists() {
        assertEquals(l(1, l(2, l(3, l(4, l(5, l(6, l(7))))))), new Solution().mergeKLists(new ListNode[]{
                null,
                l(1, l(5, l(7))),
                l(2, l(6)),
                l(3),
                null,
                l(4)
        }));
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