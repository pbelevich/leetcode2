package _114_Flatten_Binary_Tree_to_Linked_List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public void flatten(TreeNode root) {
        flatten(root, null);
    }

    private TreeNode flatten(TreeNode root, TreeNode extra) {
        if (root == null) {
            return extra;
        }
        root.right = flatten(root.left, flatten(root.right, extra));
        root.left = null;
        return root;
    }

}
