package ru.geekbrains.algorithm.linkedList1;

public class Node<T> {

    private T key;
    private Node next;

    Node(T key) { this.key = key; }

    public T getKey() { return key; }
    public void setKey(T key) { this.key = key; }
    public Node getNext() { return next; }
    public void setNext(Node next) { this.next = next; }
}
