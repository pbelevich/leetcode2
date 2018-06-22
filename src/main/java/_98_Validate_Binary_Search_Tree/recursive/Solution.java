package _98_Validate_Binary_Search_Tree.recursive;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class State {

        TreeNode root;
        Integer prev;

        public State(TreeNode root) {
            this.root = root;
        }

        boolean isValidBST() {
            return isValidBST(root);
        }

        boolean isValidBST(TreeNode node) {
            if (node != null) {
                if (!isValidBST(node.left)) return false;
                if (prev != null && prev >= node.val) {
                    return false;
                }
                prev = node.val;
                return isValidBST(node.right);
            }
            return true;
        }

    }

    public boolean isValidBST(TreeNode root) {
        return new State(root).isValidBST();
    }

}
