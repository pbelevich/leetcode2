package _833_Find_And_Replace_in_String;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void findReplaceString() {
        assertEquals("eeebffff", SOLUTION.findReplaceString("abcd", new int[]{0, 2}, new String[]{"a", "cd"}, new String[]{"eee", "ffff"}));
        assertEquals("eeecd", SOLUTION.findReplaceString("abcd", new int[]{0, 2}, new String[]{"ab", "ec"}, new String[]{"eee", "ffff"}));
        assertEquals("wqlwbtnee", SOLUTION.findReplaceString("wqzzcbnwxc", new int[]{5, 2, 7}, new String[]{"bn", "zzc", "wxc"}, new String[]{"t", "lwb", "nee"}));
        assertEquals("vbfrssozp", SOLUTION.findReplaceString("vmokgggqzp", new int[]{3, 5, 1}, new String[]{"kg", "ggq", "mo"}, new String[]{"s", "so", "bfr"}));
    }

}