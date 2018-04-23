package _148_Sort_List.quickSort;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode left = null;
        ListNode right = null;
        for (ListNode node = head.next; node != null; ) {
            ListNode next = node.next;
            if (node.val < head.val) {
                node.next = left;
                left = node;
            } else {
                node.next = right;
                right = node;
            }
            node = next;
        }
        head.next = null;

        left = sortList(left);
        right = sortList(right);

        if (left == null) {
            head.next = right;
            return head;
        } else {
            ListNode leftLast;
            for (leftLast = left; leftLast.next != null; leftLast = leftLast.next);
            leftLast.next = head;
            head.next = right;
            return left;
        }
    }

}
