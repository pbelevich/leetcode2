package _237_Delete_Node_in_a_Linked_List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
