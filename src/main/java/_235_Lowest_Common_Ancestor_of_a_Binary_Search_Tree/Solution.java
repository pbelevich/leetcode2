package _235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        } else if (p.val == q.val) {
            return p;
        } else if (p.val == root.val || q.val == root.val) {
            return root;
        } else if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

}
