package com.bridge.list;

public class ListMain {
    public static void main(String[] args) {
        System.out.println(".....linked list data structure......");
        IList<Integer> list = new LinkedList();
        list.add(56);
        list.add(70);
        list.insert(1, 30);
        list.popLast(70);
        System.out.println(list);
    }
}
