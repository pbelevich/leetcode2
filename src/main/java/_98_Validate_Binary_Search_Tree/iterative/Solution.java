package _98_Validate_Binary_Search_Tree.iterative;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        Integer prev = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            if (prev != null && prev >= node.val) {
                return false;
            }
            prev = node.val;
            root = node.right;
        }
        return true;
    }

}
