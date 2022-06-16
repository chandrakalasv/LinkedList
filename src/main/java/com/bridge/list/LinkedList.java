package com.bridge.list;

public class LinkedList<T> implements IList<T> {
    Node head;
    public void add(T num) {
        Node node = new Node(num);
        if (head == null) {
            head = node;
            return;
        }
        Node  temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    @Override
    public void addFirst(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    @Override
    public void append(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    @Override
    public void insert(T previous, T next, T data) {
        Node newNode = new Node(data);
        Node temp = head;
        Node nextNode = temp.next;

        while (!temp.data.equals(previous) && !(nextNode.data.equals(next))) {
            temp = temp.next;
            nextNode = temp.next;
        }

        temp.next = newNode;
        newNode.next = nextNode;
    }

    @Override
    public int pop(T data) {
        Node temp = head;
        head = temp.next;
        return (int) temp.data;
    }

    @Override
    public int popLast(T data) {
        Node lastNode = head;
        Node previousNode = null;
        while (lastNode.next != null) {
            previousNode = lastNode;
            lastNode = lastNode.next;
        }
        previousNode.next = null;
        return (int) lastNode.data;
    }

    @Override
    public boolean search(T data) {
        if (head.data.equals(data)) {
            return true;
        }
        Node foundNode = head.next;
        while (foundNode != null) {
            if (foundNode.data.equals(data)) {
                return true;
            }
            foundNode = foundNode.next;
        }
        return false;
    }
    @Override
    public int index(T data) {
        int i = 0;

        Node temp = head;
        while (temp != null && !temp.data.equals(data)) {
            temp = temp.next;
            i++;
        }
        return i;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
