package com.bridge.list;

public class ListMain {
    public static void main(String[] args) {
        System.out.println(".....linked list data structure......");
        IList<Integer> list = new LinkedList();
        list.addFirst(70);
        list.addFirst(30);
        list.addFirst(56);
        System.out.println(list);
    }
}
