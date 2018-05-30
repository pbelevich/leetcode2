package _783_Minimum_Distance_Between_BST_Nodes;

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

    public int minDiffInBST(TreeNode root) {
        return new Context().inorder(root, Integer.MAX_VALUE);
    }

}
