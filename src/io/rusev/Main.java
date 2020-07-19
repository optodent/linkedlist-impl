package io.rusev;

import io.rusev.collections.LinkedList;
import io.rusev.collections.List;
import io.rusev.collections.Node;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        IntStream.range(0, 100).forEach(e -> list.add(e));
        System.out.println(list.remove(Integer.valueOf(1)));
        System.out.println(list);
    }
}

