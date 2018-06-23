package _24_Swap_Nodes_in_Pairs;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public ListNode swapPairs(ListNode head) {
        return swapPairs1(head);
    }

    private ListNode swapPairs1(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else {
            ListNode first = head;
            ListNode second = head.next;
            ListNode third = head.next.next;
            second.next = first;
            first.next = swapPairs(third);
            return second;
        }
    }

}
