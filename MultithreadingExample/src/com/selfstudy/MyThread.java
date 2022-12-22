package com.selfstudy;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Value Of i is : " +i);
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {

            }
        }
    }
}
