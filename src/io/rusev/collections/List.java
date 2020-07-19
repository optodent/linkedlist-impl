package io.rusev.collections;

public interface List<E> {

    void add(E element);

    void add(E element, int index);

    E getElement(int index);

    boolean remove(E element);

    E remove(int index);

    boolean contains(E element);

    boolean isEmpty();

    int size();
}
