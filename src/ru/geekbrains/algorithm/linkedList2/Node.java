package ru.geekbrains.algorithm.linkedList2;

public class Node<T> {

    private T key;
    private Node next;
    private Node prev;

    Node(T key) { this.key = key; }

    public T getKey() { return key; }
    public void setKey(T key) { this.key = key; }
    public Node getNext() { return next; }
    public void setNext(Node next) { this.next = next; }
    public Node getPrev() { return prev; }
    public void setPrev(Node prev) { this.prev = prev; }
}
