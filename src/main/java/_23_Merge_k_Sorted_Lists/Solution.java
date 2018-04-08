package _23_Merge_k_Sorted_Lists;

/**
 * @author Pavel Belevich
 */
class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        return mergeKLists(lists, 0, lists.length);
    }

    private ListNode mergeKLists(ListNode[] lists, int lo, int hi) {
        final int len = hi - lo;
        if (len == 0) {
            return null;
        } else if (len == 1) {
            return lists[lo];
        } else {
            final int mid = (lo + hi) >>> 1;
            return merge(mergeKLists(lists, lo, mid), mergeKLists(lists, mid, hi));
        }
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            if (l1.val < l2.val) {
                l1.next = merge(l1.next, l2);
                return l1;
            } else {
                l2.next = merge(l1, l2.next);
                return l2;
            }
        }
    }

}