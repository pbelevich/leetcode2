package _105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, inorder, 0, inorder.length);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int[] inorder, int inStart, int len) {
        if (len == 0) {
            return null;
        }
        final int val = preorder[preStart];
        final TreeNode root = new TreeNode(val);
        int leftLen;
        for (leftLen = 0; leftLen < len && val != inorder[inStart + leftLen]; leftLen++) ;
        root.left = buildTree(
                preorder, preStart + 1,
                inorder, inStart,
                leftLen
        );
        root.right = buildTree(
                preorder, preStart + 1 + leftLen,
                inorder, inStart + leftLen + 1,
                len - leftLen - 1
        );
        return root;
    }

}
