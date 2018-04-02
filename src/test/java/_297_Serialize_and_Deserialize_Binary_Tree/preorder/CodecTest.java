package _297_Serialize_and_Deserialize_Binary_Tree.preorder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class CodecTest {

    public static final Codec CODEC = new Codec();

    @Test
    public void serialize() {
        assertEquals("null", CODEC.serialize(null));
        assertEquals("42,null,null", CODEC.serialize(t(42)));
        assertEquals("1,2,null,null,3,null,null", CODEC.serialize(t(1, t(2), t(3))));
    }

    @Test
    public void serializeDeserialize() {
        assertEquals(null, CODEC.deserialize(CODEC.serialize(null)));
        assertEquals(t(42), CODEC.deserialize(CODEC.serialize(t(42))));
        assertEquals(t(1, t(2), t(3)), CODEC.deserialize(CODEC.serialize(t(1, t(2), t(3)))));
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