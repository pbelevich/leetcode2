package _814_Binary_Tree_Pruning;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void pruneTree() {
        assertNull(SOLUTION.pruneTree(null));
        assertNull(SOLUTION.pruneTree(t(0)));
        assertEquals(t(1), SOLUTION.pruneTree(t(1)));
        assertEquals(t(1, t(1, t(1), t(1)), t(0, null, t(1))), SOLUTION.pruneTree(t(1, t(1, t(1, t(0), null), t(1)), t(0, t(0), t(1)))));
    }

    TreeNode t(int val, TreeNode l, TreeNode r) {
        final TreeNode treeNode = new TreeNode(val);
        treeNode.left = l;
        treeNode.right = r;
        return treeNode;
    }

    TreeNode t(int val) {
        return t(val, null, null);
    }

}