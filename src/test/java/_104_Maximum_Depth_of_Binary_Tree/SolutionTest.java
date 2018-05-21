package _104_Maximum_Depth_of_Binary_Tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void maxDepth() {
        assertEquals(0, new Solution().maxDepth(null));
        assertEquals(1, new Solution().maxDepth(new TreeNode(0)));
        assertEquals(2, new Solution().maxDepth(new TreeNode(0, new TreeNode(1), null)));
    }

}