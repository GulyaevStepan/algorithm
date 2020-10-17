package ru.geekbrains.algorithm.linkedList2;

public class LinkedList<T> {

    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
        size = 0;
    }

    public void add(T key) {
        if (first == null) {
            first = new Node(key);
            last = first;
        } else {
            last.setNext(new Node(key));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
        size++;
    }

    public T get(int index) {
        if (index < 0 || index > size) {
            return null;
        } else if (index < size/2) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
            return (T) temp.getKey();
        } else {
            Node temp = last;
            for (int i = size - 1; i > index; i--) {
                temp = temp.getPrev();
            }
            return (T) temp.getKey();
        }
    }

    public T remove(int index) {
        Node temp = null;
        if (index < 0 || index > size) {
            return null;
        } else if (index < size/2) {
            temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }

        } else {
            temp = last;
            for (int i = size - 1; i > index; i--) {
                temp = temp.getPrev();
            }
        }
        if (index == 0) {
            first = temp.getNext();
            temp.getNext().setPrev(null);
        } else if (index == size - 1) {
            last = temp.getPrev();
            temp.getPrev().setNext(null);
        } else {
            temp.getPrev().setNext(temp.getNext());
            temp.getNext().setPrev(temp.getPrev());
        }
        return (T) temp.getKey();
    }
}
