package _824_Goat_Latin;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void toGoatLatin() {
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", SOLUTION.toGoatLatin("I speak Goat Latin"));
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", SOLUTION.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }

}