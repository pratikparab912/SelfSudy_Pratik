package com.methodreference;

public class Main {
    public static void main(String[] args) {
        RefInter refInter = RefDemo::doStuff;
        //ClassName::MethodName {While Using Method Reference}
        refInter.doWork();

        System.out.println("------------------");

        Runnable runnable = RefDemo::threadDemo;
        Thread thread = new Thread(runnable);
        thread.start();

        //Referring Non-Static Methods
        //Object::MethodName
        RefDemo refDemo = new RefDemo();
        Runnable runnable1 = refDemo::printNumbers;
        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
