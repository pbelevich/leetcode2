package _716_Max_Stack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class MaxStackTest {

    @Test
    public void test() {
        MaxStack stack = new MaxStack();
        stack.push(1);
        assertEquals(1, stack.peekMax());
        assertEquals(1, stack.top());
        stack.push(2);
        assertEquals(2, stack.peekMax());
        assertEquals(2, stack.top());
        stack.push(5);
        assertEquals(5, stack.peekMax());
        assertEquals(5, stack.top());
        stack.push(3);
        assertEquals(5, stack.peekMax());
        assertEquals(3, stack.top());
        stack.push(1);
        assertEquals(5, stack.peekMax());
        assertEquals(1, stack.top());

        assertEquals(5, stack.popMax());
        assertEquals(3, stack.peekMax());

        assertEquals(1, stack.pop());
        assertEquals(3, stack.peekMax());

        assertEquals(3, stack.pop());
        assertEquals(2, stack.peekMax());
    }

    @Test
    public void test2() {
        MaxStack stack = new MaxStack();
        stack.push(5);
        stack.push(1);
        stack.push(5);
        assertEquals(5, stack.top());
        assertEquals(5, stack.popMax());
        assertEquals(1, stack.top());
        assertEquals(5, stack.peekMax());
        assertEquals(1, stack.pop());
        assertEquals(5, stack.top());
    }

}