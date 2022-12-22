package com.selfstudy;

import java.util.List;

public class StreamMethods {
    public static void main(String[] args) {
        List<String> list = List.of("Pratik", "Nikita", "Tanvi", "Meenakshi", "Aarti", "Ankita");
        list.stream().filter(e-> e.startsWith("A")).forEach(System.out::println);

        System.out.println("---------------------------");
        list.stream().forEach(System.out::println);

        System.out.println("-----------------------------");

        List<Integer> list1 = List.of(2,3,67,14,87);
        list1.stream().map(i-> i*i).forEach(System.out::println);
        //map is used to multiply numbers.

        System.out.println("-------------------------------");
        list1.stream().sorted().forEach(System.out::println);

        System.out.println("--------------------------------");
        Integer integer = list1.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Minimum Number is : " +integer);

        System.out.println("--------------------------------");
        Integer integer1 = list1.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("Maximum Number is : " +integer1);
    }
}
