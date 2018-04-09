package _156_Binary_Tree_Upside_Down;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void upsideDownBinaryTree() {
        assertEquals(t(4, t(5), t(2, t(3), t(1))),
                SOLUTION.upsideDownBinaryTree(t(1, t(2, t(4), t(5)), t(3))));
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