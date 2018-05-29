package _530_Minimum_Absolute_Difference_in_BST;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void getMinimumDifference() {
        assertEquals(1, SOLUTION.getMinimumDifference(t(3, t(2), t(6))));
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