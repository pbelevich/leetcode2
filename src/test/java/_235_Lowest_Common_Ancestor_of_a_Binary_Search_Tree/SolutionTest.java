package _235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

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
        assertNull(SOLUTION.lowestCommonAncestor(t(0), null, null));
        assertNull(SOLUTION.lowestCommonAncestor(t(0), t(0), null));
        assertNull(SOLUTION.lowestCommonAncestor(t(0), null, t(0)));
        assertEquals(2, SOLUTION.lowestCommonAncestor(t(2, t(1), t(3)), t(1), t(3)).val);
        assertEquals(2, SOLUTION.lowestCommonAncestor(t(2, t(1), t(3)), t(1), t(2)).val);
        assertEquals(2, SOLUTION.lowestCommonAncestor(t(2, t(1), t(3)), t(2), t(3)).val);
        assertEquals(3, SOLUTION.lowestCommonAncestor(t(2, t(1), t(3)), t(3), t(3)).val);
        assertEquals(1, SOLUTION.lowestCommonAncestor(t(2, t(1), t(3)), t(1), t(1)).val);
        assertEquals(2, SOLUTION.lowestCommonAncestor(t(4, t(2, t(1), t(3)), null), t(1), t(3)).val);
        assertEquals(2, SOLUTION.lowestCommonAncestor(t(4, t(2, t(1), t(3)), null), t(3), t(1)).val);
        assertEquals(6, SOLUTION.lowestCommonAncestor(t(4, null, t(6, t(5), t(7))), t(5), t(7)).val);
        assertEquals(6, SOLUTION.lowestCommonAncestor(t(4, null, t(6, t(5), t(7))), t(7), t(5)).val);
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