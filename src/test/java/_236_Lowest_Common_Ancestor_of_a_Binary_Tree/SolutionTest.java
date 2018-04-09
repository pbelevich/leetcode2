package _236_Lowest_Common_Ancestor_of_a_Binary_Tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void lowestCommonAncestor() {
        assertNull(SOLUTION.lowestCommonAncestor(null, null, null));
        TreeNode root = t(3, t(5, t(6), t(2, t(7), t(4))), t(1, t(0), t(8)));
        assertEquals(root, SOLUTION.lowestCommonAncestor(root, root.left, root.right));
        assertEquals(root.left, SOLUTION.lowestCommonAncestor(root, root.left, root.left.right.right));
    }

    TreeNode t(int val, TreeNode left, TreeNode right) {
        final TreeNode result = new TreeNode(val);
        result.left = left;
        result.right = right;
        return result;
    }

    TreeNode t(int val) {
        return t(val, null, null);
    }

}