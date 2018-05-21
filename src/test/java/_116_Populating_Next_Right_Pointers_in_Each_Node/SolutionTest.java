package _116_Populating_Next_Right_Pointers_in_Each_Node;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void connect() {
        final TreeLinkNode t = t(1, t(2), t(3));
        SOLUTION.connect(t);
        assertNull(t.next);
        assertEquals(t.right, t.left.next);
        assertNull(t.right.next);
    }

    static TreeLinkNode t(int x, TreeLinkNode l, TreeLinkNode r) {
        final TreeLinkNode res = new TreeLinkNode(x);
        res.left = l;
        res.right = r;
        return res;
    }

    static TreeLinkNode t(int x) {
        return t(x, null, null);
    }

}