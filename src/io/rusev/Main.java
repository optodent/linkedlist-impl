package io.rusev;

import io.rusev.collections.LinkedList;
import io.rusev.collections.List;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        IntStream.range(0, 100).forEach(e -> list.add(e));
        list.add(-1, 0);

        System.out.println(list.contains(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(Integer.valueOf(0)));
        System.out.println(list.getElement(0));
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        System.out.println(list);
    }
}

