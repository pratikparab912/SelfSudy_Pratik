package com.selfstudy;

public class DeskPhone implements Telephone {
    private String myTelephoneNumber;
    private boolean isRinging;

    public DeskPhone(String myTelephoneNumber) {
        this.myTelephoneNumber = myTelephoneNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Desk phone is always powered.");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing " +phoneNumber+ " on desk phone.");
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        } else {
            System.out.println("Phone is not ringing.");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber == myTelephoneNumber) {
            isRinging = true;
            System.out.println("Phone Ringing....");
        } else {
            isRinging = false;
            System.out.println("Phone number is not valid.");
        }
        return  isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
