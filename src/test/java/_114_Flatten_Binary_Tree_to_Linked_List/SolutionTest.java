package _114_Flatten_Binary_Tree_to_Linked_List;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void flatten() {
        final TreeNode t = t(1, t(2, t(3), t(4)), t(5, null, t(6)));
        SOLUTION.flatten(t);
        assertEquals(t(1, null, t(2, null, t(3, null, t(4, null, t(5, null, t(6)))))), t);
    }

    private TreeNode t(int val, TreeNode left, TreeNode right) {
        final TreeNode treeNode = new TreeNode(val);
        treeNode.left = left;
        treeNode.right = right;
        return treeNode;
    }

    private TreeNode t(int val) {
        return t(val, null, null);
    }

}