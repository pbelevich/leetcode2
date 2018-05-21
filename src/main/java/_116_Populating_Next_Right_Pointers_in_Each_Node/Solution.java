package _116_Populating_Next_Right_Pointers_in_Each_Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public void connect(TreeLinkNode root) {
        List<TreeLinkNode> curr = new ArrayList<>();
        if (root != null) {
            curr.add(root);
        }
        while (!curr.isEmpty()) {
            List<TreeLinkNode> next = new ArrayList<>();
            TreeLinkNode prev = null;
            for (int i = 0; i < curr.size(); i++) {
                TreeLinkNode node = curr.get(i);
                if (prev != null) {
                    prev.next = node;
                }
                prev = node;
                if (node.left != null) next.add(node.left);
                if (node.right != null) next.add(node.right);
            }
            curr = next;
        }
    }

}
