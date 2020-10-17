package ru.geekbrains.algorithm.stack;

import java.util.LinkedList;

public class Stack<T> {

    private LinkedList<T> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public Stack(LinkedList<T> stack) {
        this.stack = stack;
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        return stack.removeLast();
    }

    public T peek() {
        return stack.getLast();
    }

    public boolean empty() {
        return stack.isEmpty();
    }

}
