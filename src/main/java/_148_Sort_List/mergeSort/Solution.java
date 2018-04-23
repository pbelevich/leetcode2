package _148_Sort_List.mergeSort;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow;
        ListNode fast;
        for (slow = head, fast = head.next; fast != null && fast.next != null; slow = slow.next, fast = fast.next.next);
        ListNode right = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        right = sortList(right);
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode curr = new ListNode(0);
        ListNode preHead = curr;
        while (left != null || right != null) {
            if (right == null || (left != null && left.val < right.val)) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        return preHead.next;
    }

}
