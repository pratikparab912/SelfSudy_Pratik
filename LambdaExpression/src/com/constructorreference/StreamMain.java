package com.constructorreference;

import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 4, 5, 6);
        list.stream().forEach(System.out::println);
    }
}
