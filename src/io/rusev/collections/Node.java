package io.rusev.collections;

import java.util.Objects;

public class Node<E> {

    private E data;
    private Node<E> nextNode;

    public Node(E data, Node<E> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(data, node.data) &&
                Objects.equals(nextNode, node.nextNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, nextNode);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", nextNode=" + nextNode +
                '}';
    }
}
