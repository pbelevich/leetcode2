package _814_Binary_Tree_Pruning;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        } else {
            root.left = pruneTree(root.left);
            root.right = pruneTree(root.right);
            if (root.left == null && root.right == null && root.val == 0) {
                root = null;
            }
            return root;
        }
    }

}
