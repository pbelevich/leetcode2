package _104_Maximum_Depth_of_Binary_Tree;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }

}
