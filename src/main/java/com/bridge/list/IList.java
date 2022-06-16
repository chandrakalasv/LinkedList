package com.bridge.list;

public interface IList<T> {
    void add(T data);
    void addFirst(T data);
    void append(T data);
    void insert(int pos,T data);
    int pop(T data);
    int popLast(T data);
    boolean search(T data);
    int index(T data);
}
