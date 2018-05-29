package _530_Minimum_Absolute_Difference_in_BST;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Context {

        Integer prev;

        int inorder(TreeNode root, int min) {
            if (root != null) {
                min = inorder(root.left, min);
                if (prev != null) {
                    min = Math.min(min, Math.abs(root.val - prev));
                }
                prev = root.val;
                return inorder(root.right, min);
            }
            return min;
        }

    }

    public int getMinimumDifference(TreeNode root) {
        return new Context().inorder(root, Integer.MAX_VALUE);
    }

}
