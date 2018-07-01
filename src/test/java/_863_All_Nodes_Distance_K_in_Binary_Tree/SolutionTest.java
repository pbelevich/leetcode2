package _863_All_Nodes_Distance_K_in_Binary_Tree;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void distanceK1() {
        final TreeNode t = t(3, t(5, t(6), t(2, t(7), t(4))), t(1, t(0), t(8)));
        assertEquals(new HashSet<>(Arrays.asList(7, 4, 1)), new HashSet<>(SOLUTION.distanceK(t, t.left, 2)));
        assertEquals(new HashSet<>(Collections.singletonList(5)), new HashSet<>(SOLUTION.distanceK(t, t.left, 0)));
        assertEquals(new HashSet<>(Arrays.asList(3, 2, 6)), new HashSet<>(SOLUTION.distanceK(t, t.left, 1)));
        assertEquals(new HashSet<>(Arrays.asList(0, 8)), new HashSet<>(SOLUTION.distanceK(t, t.left, 3)));
    }

    @Test
    public void distanceK2() {
        final TreeNode t = t(0, t(2), t(1, t(3), null));
        assertEquals(new HashSet<>(Collections.singletonList(2)), new HashSet<>(SOLUTION.distanceK(t, t.right.left, 3)));
    }

    @Test
    public void distanceK3() {
        final TreeNode t = t(1);
        assertEquals(new HashSet<>(Collections.emptyList()), new HashSet<>(SOLUTION.distanceK(t, t, 3)));
    }

    @Test
    public void distanceK4() {
        final TreeNode t = t(0, null, t(1, t(2, null, t(3, null, t(4))), t(5)));
        assertEquals(new HashSet<>(Arrays.asList(4, 5, 0)), new HashSet<>(SOLUTION.distanceK(t, t.right.left, 2)));
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