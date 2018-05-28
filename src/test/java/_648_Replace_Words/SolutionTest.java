package _648_Replace_Words;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void replaceWords() {
        assertEquals("the cat was rat by the bat",
                SOLUTION.replaceWords(Arrays.asList("cat", "bat", "rat"),
                        "the cattle was rattled by the battery"));

        assertEquals("  the cat was rat by the bat  ",
                SOLUTION.replaceWords(Arrays.asList("cat", "bat", "rat"),
                        "  the cattle was rattled by the battery  "));
    }

}