package _94_Binary_Tree_Inorder_Traversal.iterative;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        pushLefts(root, stack);
        while (!stack.isEmpty()) {
            final TreeNode i = stack.pop();
            res.add(i.val);
            if (i.right != null) {
                pushLefts(i.right, stack);
            }
        }
        return res;
    }

    private void pushLefts(TreeNode node, Deque<TreeNode> stack) {
        for (TreeNode i = node; i != null; i = i.left) {
            stack.push(i);
        }
    }

}
