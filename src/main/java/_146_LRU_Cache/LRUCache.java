package _146_LRU_Cache;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pavel Belevich
 */
public class LRUCache {

    static class Node {
        int key;
        int value;
        Node next;
        Node prev;
    }

    private final Map<Integer, Node> map = new HashMap<>();
    private final Node head;
    private final Node tail;
    private final int capacity;
    private int size;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new Node();
        this.tail = new Node();
        this.head.next = tail;
        this.tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        insert(remove(node));
        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node == null) {
            node = new Node();
            node.key = key;
            node.value = value;
            insert(node);
            map.put(key, node);
            if (size == capacity) {
                map.remove(tail.prev.key);
                remove(tail.prev);
            } else {
                size++;
            }
        } else {
            node.value = value;
            insert(remove(node));
        }
    }

    private void insert(Node node) {
        Node nextToHead = head.next;
        head.next = node;
        node.prev = head;
        node.next = nextToHead;
        nextToHead.prev = node;
    }

    private Node remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
        return node;
    }

}
