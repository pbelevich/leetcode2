package _94_Binary_Tree_Inorder_Traversal.iterative;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void inorderTraversal() {
        assertEquals(Arrays.asList(1, 3, 5), SOLUTION.inorderTraversal(t(3, t(1), t(5))));
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