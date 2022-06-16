package com.bridge.list;

public interface IList<T> {
    void add(T data);
    void addFirst(T data);
    void append(T data);
    void insert(int pos,T data);
    void pop();
    void popLast();
    boolean search(T data);
    int index(T data);
    boolean remove(T data);
    int size();
}
