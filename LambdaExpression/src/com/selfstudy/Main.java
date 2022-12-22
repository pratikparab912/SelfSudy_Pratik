package com.selfstudy;

public class Main {
    public static void main(String[] args) {
        MyInter myInter = () -> System.out.println("Saying Hello Using Lambda Expression");
        myInter.sayHello();

        SumInter sumInter = (a, b) -> (a + b);
        System.out.println(sumInter.sum(2, 3));

        CalculateLength calculateLength = (str) -> str.length();
        System.out.println("Value Of Given String is : " +calculateLength.getLength("Pratik"));
    }
}
