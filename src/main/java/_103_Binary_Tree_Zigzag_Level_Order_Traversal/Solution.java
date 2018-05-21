package _103_Binary_Tree_Zigzag_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> curr = new ArrayList<>();
        if (root != null) {
            curr.add(root);
        }
        boolean b = false;
        while (!curr.isEmpty()) {
            List<TreeNode> next = new ArrayList<>();
            List<Integer> res = new ArrayList<>();
            for (TreeNode node : curr) {
                if (node.left != null) next.add(node.left);
                if (node.right != null) next.add(node.right);
                res.add(node.val);
            }
            if (b) {
                Collections.reverse(res);
            }
            result.add(res);
            curr = next;
            b = !b;
        }
        return result;
    }

}
