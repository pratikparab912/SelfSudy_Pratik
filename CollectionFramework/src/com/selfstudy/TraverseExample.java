package com.selfstudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sagar");
        names.add("Amit");
        names.add("Akshay");
        names.add("Amol");
        names.add("Ganesh");
        names.add("Nikita");
        System.out.println(names);

        System.out.println("\n");
        System.out.println("--------------------------");

        for (String str : names) {
            System.out.print(str + "\t" + str.length() + "\t");
            StringBuffer stringBuffer = new StringBuffer(str);
            System.out.println(stringBuffer.reverse());
        }

        System.out.println("\n");
        System.out.println("+++++++++++++For Each Method - Java 8++++++++++++++");
        names.forEach(e -> {
            System.out.println(e);
        });

        System.out.println("\n");
        System.out.println("=======Sorting Of Elements (According To Alphabet)=========");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(names);
        treeSet.forEach(p -> {
            System.out.println(p);
        });
//        names.stream().sorted().forEach(System.out::println);

        System.out.println("\n");
        System.out.println("********Traversing Using Iterator : Forward Traversing*************");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }

        System.out.println("\n");
        System.out.println("$$$$$$$$Traversing Using List Iterator : Backward Traversing$$$$$$$$$$$$");
        ListIterator<String> listIterator = names.listIterator(names.size());
        while (listIterator.hasPrevious()) {
            String string = listIterator.previous();
            System.out.println(string);
        }
    }
}
