package _716_Max_Stack;

import java.util.*;

/**
 * @author Pavel Belevich
 */
public class MaxStack {

    static class Node {
        final int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    private final Node head = new Node(0);
    private final Node tail = new Node(0);

    {
        head.next = tail;
        tail.prev = head;
    }

    private SortedMap<Integer, List<Node>> map = new TreeMap<>();

    private boolean isEmpty() {
        return head.next == tail || tail.prev == head;
    }

    private void delete(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    /**
     * initialize your data structure here.
     */
    public MaxStack() {

    }

    public void push(int x) {
        Node node = new Node(x);
        node.next = tail;
        node.prev = tail.prev;
        tail.prev.next = node;
        tail.prev = node;
        map.computeIfAbsent(x, z -> new ArrayList<>()).add(node);
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException();
        Node node = tail.prev;
        delete(node);
        List<Node> nodes = map.get(node.value);
        nodes.remove(node);
        if (nodes.isEmpty()) {
            map.remove(node.value);
        }
        return node.value;
    }

    public int top() {
        if (isEmpty()) throw new RuntimeException();
        return tail.prev.value;
    }

    public int peekMax() {
        if (isEmpty()) throw new RuntimeException();
        return map.lastKey();
    }

    public int popMax() {
        if (isEmpty()) throw new RuntimeException();
        int max = map.lastKey();
        List<Node> nodes = map.get(max);
        Node node = nodes.remove(nodes.size() - 1);
        if (nodes.isEmpty()) {
            map.remove(max);
        }
        delete(node);
        return node.value;
    }
}