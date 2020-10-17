package ru.geekbrains.algorithm.queue;

import java.util.LinkedList;

public class Queue<T> {

    private LinkedList<T> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    public Queue(LinkedList<T> queue) {
        this.queue = queue;
    }

    public void add(T element) { queue.add(element); }

    public T poll() { return queue.removeFirst(); }

    public T peek() { return queue.getFirst(); }

    public boolean empty() { return queue.isEmpty(); }
}
