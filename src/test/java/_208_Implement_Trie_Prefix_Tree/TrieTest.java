package _208_Implement_Trie_Prefix_Tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class TrieTest {

    @Test
    public void insert() {
        final Trie trie = new Trie();
        assertFalse(trie.startsWith(null));
        trie.insert("abc");
        assertTrue(trie.search("abc"));
        assertFalse(trie.search("abcd"));
        assertFalse(trie.search("abd"));
        assertFalse(trie.search("ab"));
        assertFalse(trie.search("a"));
        assertTrue(trie.startsWith("a"));
        assertTrue(trie.startsWith("ab"));
        assertTrue(trie.startsWith("abc"));
        assertFalse(trie.startsWith("abcd"));
    }

}