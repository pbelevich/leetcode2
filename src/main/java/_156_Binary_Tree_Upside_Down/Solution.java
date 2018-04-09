package _156_Binary_Tree_Upside_Down;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public TreeNode upsideDownBinaryTree(TreeNode root) {
        TreeNode newRoot = null;
        TreeNode prevRight = null;
        for (TreeNode node = root; node != null; node = node.left) {
            TreeNode newNode = new TreeNode(node.val);
            newNode.left = prevRight;
            newNode.right = newRoot;
            prevRight = node.right;
            newRoot = newNode;
        }
        return newRoot;
    }

}
