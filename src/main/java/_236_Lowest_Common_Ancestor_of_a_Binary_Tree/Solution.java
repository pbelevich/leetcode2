package _236_Lowest_Common_Ancestor_of_a_Binary_Tree;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        } else {
            if (root == p) {
                return p;
            } else if (root == q) {
                return q;
            } else {
                final TreeNode left = lowestCommonAncestor(root.left, p, q);
                final TreeNode right = lowestCommonAncestor(root.right, p, q);
                if (left != null && right != null) {
                    return root;
                } else if (left != null) {
                    return left;
                } else if (right != null) {
                    return right;
                } else {
                    return null;
                }
            }
        }
    }

}
