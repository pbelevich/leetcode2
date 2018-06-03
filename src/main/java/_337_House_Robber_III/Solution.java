package _337_House_Robber_III;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private static final int[] ZERO = new int[]{0, 0};

    public int rob(TreeNode root) {
        int[] result = helper(root);
        return Math.max(result[0], result[1]);
    }

    private int[] helper(TreeNode root) {
        if (root == null) {
            return ZERO;
        }

        int[] left = helper(root.left);
        int[] right = helper(root.right);
        return new int[]{
                root.val + left[1] + right[1],
                Math.max(left[0], left[1]) + Math.max(right[0], right[1])
        };
    }

}
