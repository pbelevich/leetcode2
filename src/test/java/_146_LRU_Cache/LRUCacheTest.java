package _146_LRU_Cache;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class LRUCacheTest {

    @Test
    public void getEmpty() {
        LRUCache cache = new LRUCache(0);

        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(-1, cache.get(1));
        cache.put(3, 3);
        assertEquals(-1, cache.get(2));
        cache.put(4, 4);
        assertEquals(-1, cache.get(1));
        assertEquals(-1, cache.get(3));
        assertEquals(-1, cache.get(4));
    }

    @Test
    public void get() {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));
        cache.put(3, 3);
        assertEquals(-1, cache.get(2));
        cache.put(4, 4);
        assertEquals(-1, cache.get(1));
        assertEquals(3, cache.get(3));
        assertEquals(4, cache.get(4));
    }

}