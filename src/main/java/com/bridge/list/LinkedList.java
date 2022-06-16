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
    public void insert(int pos,T data) {
        Node newNode = new Node(data);
        if(pos == index((T) head.data)){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node requiredNode = head.next;
        Node previousNode = head;
        while(pos != index((T) requiredNode.data)){
            previousNode = requiredNode;
            requiredNode = requiredNode.next;
        }
        newNode.next = requiredNode;
        previousNode.next = newNode;
    }

    @Override
    public void pop() {
        Node temp = head;
        head = temp.next;
    }

    @Override
    public void popLast() {
        Node lastNode = head;
        Node previousNode = null;
        while (lastNode.next != null) {
            previousNode = lastNode;
            lastNode = lastNode.next;
        }
        previousNode.next = null;
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
        int index = 0;

        Node temp = head;
        while (temp != null && !temp.data.equals(data)) {
            temp = temp.next;
            index++;
        }
        return index;
    }
    @Override
    public boolean remove(T num) {
        if(head.data.equals(num)){
            head = head.next;
            return true;
        }
        Node previous = head;
        Node requiredData ;
        while (previous.next != null && !previous.next.data.equals(num)){
            previous = previous.next;
        }
        requiredData = previous.next;
        previous.next = requiredData.next;
        return true ;
    }
    @Override
    public int size() {
      Node temp=head;
        int count = 0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
