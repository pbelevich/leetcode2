package _203_Remove_Linked_List_Elements;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        final ListNode preHead = new ListNode(0);
        preHead.next = head;

        for (ListNode prev = preHead; prev.next != null; ) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }

        return preHead.next;
    }

}
