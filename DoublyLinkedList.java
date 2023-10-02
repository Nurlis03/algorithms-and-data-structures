import java.util.Iterator;

import javax.management.RuntimeErrorException;

public class DoublyLinkedList <T> implements Iterable <T> {

    private int size = 0;
    private Node <T> head = null;
    private Node <T> tail = null;

    private class Node <T> {
        T data;
        Node <T> prev, next;
        public Node(T data, Node <T> prev, Node <T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        @Override public String toString() {
            return data.toString();
        }
    }

    // Empty this linked list, O(n)
    public void clear() {
        Node <T> trav = head;
        while (trav != null) {
            Node <T> next = trav.next;
            trav.prev = trav.next = null;
            trav.data = null;
            trav = next;
        }
        head = tail = trav = null;
        size = 0;
    }

    // Return the size of this linked list
    public int size() {
        return size;
    }

    // Is this linked list empty?
    public boolean isEmpty() {
        return size() == 0;
    }
    
    // Add an element to the tail of the linked list, O(1)
    public void add(T elem) {
        addLast(elem);
    }

    // Add an element to the beginning of this linked list, O(1)
    public void addFirst(T elem) {
        // The linked list is empty
        if (isEmpty()) {
            head = tail = new Node <T> (elem, null, null);
        }
        else {
            head.prev = new Node <T> (elem, null, head);
            head = head.prev;
        }
        size++;
    }

    // Add a node to the tail of the linked list, O(1)
    public void addLast(T elem) {
        // The linked list is empty
        if (isEmpty()) {
            head = tail = new Node <T> (elem, null, null);
        }
        else {
            tail.next = new Node <T> (elem, tail, null);
            tail = tail.next;
        }
        size++;
    }

    // Check the value of the first node if it exists, O(1)
    public T peekFirst() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        return head.data;
    }

    // Check the value of the last node if it exists, O(1)
    public T peekLast() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        return tail.data;
    }

    // Remove the first value at the head of the linked list, O(1)
    public T removeFirst() {
        // Can't remove data from an empty lsit -_-
        if (isEmpty()) throw new RuntimeException("Empty list");

        // Extract the data at the head and move
        // the head pointer forwards one node
        T data = head.data;
        head = head.next;
        --size;

        // If the list is empty set the tail to null as well
        if (isEmpty()) tail = null;

        // Do a memory clean of the previous node
        else head.prev = null;

        // Return the data that was at the first node we just removed
        return data;
    }
    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
    
}
