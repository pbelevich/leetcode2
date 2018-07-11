package _234_Palindrome_Linked_List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isPalindrome(ListNode head) {
        ListNode slow, fast;
        for (slow = head, fast = head; fast != null && fast.next != null && fast.next.next != null; slow = slow.next, fast = fast.next.next)
            ;

        ListNode prev = slow;
        ListNode curr = slow != null ? slow.next : null;
        if (slow != null) {
            slow.next = null;
        }
        ListNode next = curr != null ? curr.next : null;

        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }

        for (ListNode forward = head, backward = prev; forward != null && backward != null; forward = forward.next, backward = backward.next) {
            if (forward.val != backward.val) {
                return false;
            }
        }
        return true;
    }

}
