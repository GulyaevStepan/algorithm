package ru.geekbrains.algorithm.queue;

import java.util.LinkedList;

public class Deque<T> {

    private LinkedList<T> deque;

    public Deque() {
        deque = new LinkedList<>();
    }

    public Deque(LinkedList<T> deque) {
        this.deque = deque;
    }

    public void addFirst(T element) { deque.addFirst(element); }
    public void addLast(T element) { deque.addLast(element); }

    public T pollFirst() { return deque.removeFirst(); }
    public T pollLast() { return deque.removeLast(); }

    public T peekFirst() { return deque.getFirst(); }
    public T peekLast() { return deque.getLast(); }

    public boolean empty() { return deque.isEmpty(); }
}
