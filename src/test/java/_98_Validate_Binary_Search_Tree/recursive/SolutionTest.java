package _98_Validate_Binary_Search_Tree.recursive;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void isValidBST() {
        assertTrue(SOLUTION.isValidBST(null));
        assertTrue(SOLUTION.isValidBST(t(2, t(1), t(3))));
        assertFalse(SOLUTION.isValidBST(t(5, t(1), t(4, t(3), t(6)))));
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