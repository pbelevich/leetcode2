package _94_Binary_Tree_Inorder_Traversal.recursive;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        final List<Integer> res = new ArrayList<>();
        inorderTraversal(root, res);
        return res;
    }

    private void inorderTraversal(TreeNode root, List<Integer> res) {
        if (root != null) {
            inorderTraversal(root.left, res);
            res.add(root.val);
            inorderTraversal(root.right, res);
        }
    }

}
