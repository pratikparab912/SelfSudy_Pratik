package com.selfstudy;

public class Main {
    public static void main(String[] args) {
        Button buttonLogIn = new Button();
        buttonLogIn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("User is Logged In.....");
            }
        });

        Button buttonLogOut = new Button();
        buttonLogOut.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("User is Logged Out....");
            }
        });
    }
}
