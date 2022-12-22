package com.selfstudy;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,12,23,67,84);
        list.stream().map(i-> i*i).forEach(System.out::println);

        System.out.println("---------------------");

        List<Integer> list1 = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(list1);

        System.out.println("---------------------");

        List<Integer> list2 = list.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(list2);

    }
}
