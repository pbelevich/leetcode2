package _863_All_Nodes_Distance_K_in_Binary_Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        if (K == 0) {
            return Collections.singletonList(target.val);
        }
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> path = path(root, target, new Stack<>());
        TreeNode prev = target;
        for (int k = 1; k <= K && !path.isEmpty(); k++) {
            final TreeNode parent = path.pop();
            if (k == K) {
                result.add(parent.val);
            } else {
                final TreeNode another = another(parent, prev);
                result.addAll(descendant(another, K - 1 - k));
                prev = parent;
            }
        }
        result.addAll(descendant(target, K));
        return result;
    }

    private TreeNode another(TreeNode root, TreeNode sibling) {
        if (root.left == sibling) {
            return root.right;
        } else {
            return root.left;
        }
    }

    private Stack<TreeNode> path(TreeNode root, TreeNode target, Stack<TreeNode> stack) {
        if (root != null) {
            if (root.val == target.val) {
                return stack;
            }
            stack.push(root);
            final Stack<TreeNode> leftRes = path(root.left, target, stack);
            if (leftRes != null) {
                return leftRes;
            }
            final Stack<TreeNode> rightRes = path(root.right, target, stack);
            if (rightRes != null) {
                return rightRes;
            }
            stack.pop();
        }
        return null;
    }

    private List<Integer> descendant(TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();
        descendant(target, k, result);
        return result;
    }

    private void descendant(TreeNode target, int k, List<Integer> result) {
        if (target != null) {
            if (k == 0) {
                result.add(target.val);
            }
            descendant(target.left, k - 1, result);
            descendant(target.right, k - 1, result);
        }
    }

}
