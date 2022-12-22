package com.methodreference;

public class RefDemo {
    public static void doStuff() {
        System.out.println("I am doing work.");
    }

    public static void threadDemo() {
        for (int i=1;i<=10;i++) {
            System.out.println(i*2);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }

    public void printNumbers() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
