package com.selfstudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        String names[] = {"Pratik", "Nikita" , "Tanvi", "Aarti", "Meenakshi", "Ankita"};
        Stream<String> string = Stream.of(names);
        string.forEach(System.out::println);

        System.out.println("-----------------------");

        IntStream intStream = Arrays.stream(new int[]{2, 4, 56, 73, 876});
        intStream.forEach(System.out::println);

        System.out.println("========================");
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(67);
        list.add(45);
        list.add(90);

        Stream<Integer> stream1 = list.stream();
        stream1.forEach(System.out::println);
    }
}
