package com.selfstudy;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for(int i = 1 ; i <= 10 ; i++) {
                System.out.println("Value Of i is : " +i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
