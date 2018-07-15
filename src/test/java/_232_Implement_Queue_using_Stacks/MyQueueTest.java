package _232_Implement_Queue_using_Stacks;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class MyQueueTest {

    @Test
    public void push() {
        final MyQueue q = new MyQueue();
        assertTrue(q.empty());

        q.push(1);
        assertEquals(1, q.peek());
        assertFalse(q.empty());
        q.push(2);
        assertEquals(1, q.peek());
        assertFalse(q.empty());
        q.push(3);
        assertEquals(1, q.peek());
        assertFalse(q.empty());

        assertEquals(1, q.pop());
        assertFalse(q.empty());
        assertEquals(2, q.peek());

        assertEquals(2, q.pop());
        assertFalse(q.empty());
        assertEquals(3, q.peek());

        q.push(4);
        assertEquals(3, q.peek());
        assertFalse(q.empty());
        q.push(5);
        assertEquals(3, q.peek());
        assertFalse(q.empty());

        assertEquals(3, q.pop());
        assertFalse(q.empty());
        assertEquals(4, q.peek());

        assertEquals(4, q.pop());
        assertFalse(q.empty());
        assertEquals(5, q.peek());

        assertEquals(5, q.pop());
        assertTrue(q.empty());
    }

}