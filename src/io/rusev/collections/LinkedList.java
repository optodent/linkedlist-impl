package io.rusev.collections;

import java.util.Objects;

public class LinkedList<E> implements List<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedList() {
    }

    @Override
    public void add(E element) {
        if (head != null) {
            Node<E> nextNode = new Node<>(element, null);
            tail.setNextNode(nextNode);
            tail = nextNode;
        }  else {
            head = new Node<>(element, null);
            tail = head;
        }
        size++;
    }

    @Override
    public void add(E element, int index) {
        if (index == 0) {
            head = new Node<>(element, head);
            size++;
        } else if (index == size) {
            add(element);
        } else {
            Node<E> prev = getElementNode(index - 1);
            Node<E> next = getElementNode(index);
            prev.setNextNode(new Node<>(element, next));;
            size++;
        }
    }

    @Override
    public E getElement(int index) {
        return getElementNode(index).getData();
    }

    private Node<E> getElementNode(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("List size: " + size + ", index: " + index);
        }

        Node<E> currentNode = head;
        int counter = 0;
        while (counter != index) {
            currentNode = currentNode.getNextNode();
            counter++;
        }
        return currentNode;
    }

    @Override
    public boolean remove(E element) {
        return rem(element, -1) != null;
    }

    private Node<E> rem(E element, int index) {
        Node<E> current = head;
        Node<E> prev = null;
        int counter = 0;
        while (current.getNextNode() != null || current.equals(tail) ) {
            if (current.getData().equals(element) || index == counter) {

                if (prev == null) {
                    head = head.getNextNode();
                } else {
                    prev.setNextNode(current.getNextNode());
                }
                size--;
                return current;
            }
            prev = current;
            current = current.getNextNode();
            counter++;
        }
        return null;
    }

    @Override
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("List size: " + size + ", index: " + index);
        }
        return rem(null, index).getData();
    }

    @Override
    public boolean contains(E element) {
        Node<E> current = head;
        while (current.getNextNode() != null) {
            if (current.getData().equals(element)) {
                return true;
            }
            current = current.getNextNode();
        }

        return element.equals(current.getData());
    }

    @Override
    public boolean isEmpty() {
        return Objects.isNull(head);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
