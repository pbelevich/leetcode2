package _102_Binary_Tree_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> curr = new ArrayList<>();
        if (root != null) {
            curr.add(root);
        }
        while (!curr.isEmpty()) {
            List<TreeNode> next = new ArrayList<>();
            List<Integer> res = new ArrayList<>();
            for (TreeNode node : curr) {
                if (node.left != null) next.add(node.left);
                if (node.right != null) next.add(node.right);
                res.add(node.val);
            }
            result.add(res);
            curr = next;
        }
        return result;
    }

}
