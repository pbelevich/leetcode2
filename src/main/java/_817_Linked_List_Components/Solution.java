package _817_Linked_List_Components;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set = new HashSet<>();
        for (int g : G) {
            set.add(g);
        }

        int count = 0;
        for (ListNode i = head; i != null; ) {
            if (set.contains(i.val)) {
                ListNode j;
                for (j = i; j != null && set.contains(j.val); j = j.next) ;
                i = j;
                count++;
            } else {
                i = i.next;
            }
        }
        return count;
    }

}
