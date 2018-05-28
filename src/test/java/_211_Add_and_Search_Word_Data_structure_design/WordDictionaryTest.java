package _211_Add_and_Search_Word_Data_structure_design;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class WordDictionaryTest {

    @Test
    public void addWord() {
        final WordDictionary dict = new WordDictionary();
        assertFalse(dict.search(null));
        assertFalse(dict.search(""));
        assertFalse(dict.search("abc"));

        dict.addWord("abc");
        assertTrue(dict.search("abc"));
        assertFalse(dict.search("a"));
        assertFalse(dict.search("ab"));
        assertFalse(dict.search("abd"));
        assertFalse(dict.search("bc"));
        assertFalse(dict.search("c"));
        assertFalse(dict.search(""));

        dict.addWord("abd");
        assertTrue(dict.search("abc"));
        assertTrue(dict.search("abd"));
        assertFalse(dict.search("a"));
        assertFalse(dict.search("ab"));
        assertFalse(dict.search("bc"));
        assertFalse(dict.search("bd"));
        assertFalse(dict.search("c"));
        assertFalse(dict.search("d"));
        assertFalse(dict.search(""));

        dict.addWord("a");
        assertTrue(dict.search("abc"));
        assertTrue(dict.search("abd"));
        assertTrue(dict.search("a"));
        assertFalse(dict.search("ab"));
        assertFalse(dict.search("bc"));
        assertFalse(dict.search("bd"));
        assertFalse(dict.search("c"));
        assertFalse(dict.search("d"));
        assertFalse(dict.search(""));
    }

    @Test
    public void searchWordWithWildcard() {
        final WordDictionary dict = new WordDictionary();
        dict.addWord("abc");
        dict.addWord("abd");
        assertTrue(dict.search("ab."));
        assertFalse(dict.search("a."));
        assertTrue(dict.search("a.."));
        assertTrue(dict.search("..."));
        assertFalse(dict.search(".."));
        assertFalse(dict.search("."));
        assertTrue(dict.search(".bc"));
        assertTrue(dict.search(".b."));
        assertTrue(dict.search("..c"));
        assertTrue(dict.search("a.c"));
        assertFalse(dict.search("a.e"));
    }

    @Test
    public void search() {
        final WordDictionary dict = new WordDictionary();
        dict.addWord("ran");
        dict.addWord("rune");
        dict.addWord("runner");
        dict.addWord("runs");
        dict.addWord("add");
        dict.addWord("adds");
        dict.addWord("adder");
        dict.addWord("addee");
        assertTrue(dict.search("r.n"));
        assertFalse(dict.search("ru.n.e"));
        assertTrue(dict.search("add"));
        assertTrue(dict.search("add."));
    }

}