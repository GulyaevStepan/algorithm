package ru.geekbrains.algorithm.linkedList1;

public class LinkedList<T> {

    private Node first;
    private int size;

    public LinkedList() {
        size = 0;
    }

    public void add(T key) {
        if (first == null) {
            first = new Node(key);
        } else {
            Node temp = first;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(key));
        }
        size++;
    }

    public T get(int index) {
        if (index < 0 || index > size) {
            return null;
        } else {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
            return (T) temp.getKey();
        }
    }

    public T remove(int index) {
        if (index < 0 || index > size) {
            return null;
        } else {
            Node temp = first;
            Node prevTemp = null;
            if (index == 0) {
                first = temp.getNext();
            } else {
                for (int i = 0; i < index; i++) {
                    if (i == index - 1) {
                        prevTemp = temp;
                    }
                    temp = temp.getNext();
                }
                prevTemp.setNext(prevTemp.getNext().getNext());
            }
            return (T) temp.getKey();
        }
    }
}
