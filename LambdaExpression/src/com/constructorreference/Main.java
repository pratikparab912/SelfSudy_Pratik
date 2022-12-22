package com.constructorreference;

public class Main {
    public static void main(String[] args) {
        //Constructor Reference
        //ClassName::new
        StudentInter studentInter = Student::new;
        Student student = studentInter.getResult();
        student.displayMethod();
    }
}
