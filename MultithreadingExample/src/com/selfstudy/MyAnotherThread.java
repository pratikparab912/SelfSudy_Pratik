package com.selfstudy;

public class MyAnotherThread extends Thread {
    @Override
    public void run() {
        for(int i = 10 ; i >= 1 ; i--) {
            System.out.println("Value Of i is : " +i);
            try
            {
                Thread.sleep(2000);
            }
            catch (Exception e)
            {

            }
        }
    }
}
