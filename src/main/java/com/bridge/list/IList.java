package com.bridge.list;

public interface IList<T> {
    void add(T data);
    void append(T data);
    void insert(T previous, T next, T data);
    int pop(T data);
    int popLast(T data);
    boolean search(T data);
    int index(T data);
}
