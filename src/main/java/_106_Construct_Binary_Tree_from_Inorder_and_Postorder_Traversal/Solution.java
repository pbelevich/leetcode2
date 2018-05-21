package _106_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(postorder, 0, inorder, 0, inorder.length);
    }

    private TreeNode buildTree(int[] postorder, int postStart, int[] inorder, int inStart, int len) {
        if (len == 0) {
            return null;
        }
        final int val = postorder[postStart + len - 1];
        final TreeNode root = new TreeNode(val);
        int leftLen;
        for (leftLen = 0; leftLen < len && val != inorder[inStart + leftLen]; leftLen++) ;
        root.left = buildTree(
                postorder, postStart,
                inorder, inStart,
                leftLen
        );
        root.right = buildTree(
                postorder, postStart + leftLen,
                inorder, inStart + leftLen + 1,
                len - leftLen - 1
        );
        return root;
    }

}
