package _866_Smallest_Subtree_with_all_the_Deepest_Nodes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void subtreeWithAllDeepest() {
        assertEquals(t(2), SOLUTION.subtreeWithAllDeepest(t(1, t(2), null)));
        assertEquals(t(2), SOLUTION.subtreeWithAllDeepest(t(1, null, t(2))));
        assertEquals(t(2, t(7), t(4)), SOLUTION.subtreeWithAllDeepest(t(3, t(5, t(6), t(2, t(7), t(4))), t(1, t(0), t(8)))));
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