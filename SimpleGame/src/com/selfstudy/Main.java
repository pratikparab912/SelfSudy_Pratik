package com.selfstudy;

public class Main {
    public static void main(String[] args) {
        Player1 player1 = new Player1("Pratik", "Sword", 100);
        player1.damageByGun1();
        player1.damageByGun1();
        player1.damageByGun2();
        player1.heal();

        System.out.println("\n");

        Player2 player2 = new Player2("Amit", "Machine Gun", 90,true);
        player2.damageByGun1();
        player2.damageByGun2();
        player2.heal();
    }
}
