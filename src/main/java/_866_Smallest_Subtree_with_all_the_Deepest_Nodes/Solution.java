package _866_Smallest_Subtree_with_all_the_Deepest_Nodes;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Pair {
        final TreeNode node;
        final int depth;

        public Pair(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return subtreeWithAllDeepest(root, 0).node;
    }

    private Pair subtreeWithAllDeepest(TreeNode root, int i) {
        if (root != null) {
            final Pair left = subtreeWithAllDeepest(root.left, i + 1);
            final Pair right = subtreeWithAllDeepest(root.right, i + 1);
            if (left == null && right == null) {
                return new Pair(root, i);
            } else if (left == null) {
                return right;
            } else if (right == null) {
                return left;
            } else {
                if (left.depth > right.depth) {
                    return left;
                } else if (left.depth < right.depth) {
                    return right;
                } else {
                    return new Pair(root, Math.max(left.depth, right.depth));
                }
            }
        } else {
            return null;
        }
    }

}
