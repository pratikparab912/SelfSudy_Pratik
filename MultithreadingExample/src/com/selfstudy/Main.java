package com.selfstudy;

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread thread = new Thread(t1);
        System.out.println("Implements Runnable Interface");
        thread.run();

        System.out.println("\n");

        System.out.println("Extending Thread Class");
        MyAnotherThread t2 = new MyAnotherThread();
        t2.run();
    }
}
