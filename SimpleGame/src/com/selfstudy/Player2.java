package com.selfstudy;

public class Player2 extends Player1 {
    private int health;
    private boolean armour;
    public Player2(String playerName, String weapon, int health, boolean armour) {
        super(playerName, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damageByGun1() {
        if(armour) {
            this.health -= 20;
            System.out.println("Armour is on. Got hit by Gun 1. Health is reduced by 20. New health is : " +this.health);
        } else {
            this.health -=30;
            System.out.println("Armour is off. Got hit by Gun 1. Health is reduced by 30. New health is : " +this.health);
        }

        if(this.health <= 0) {
            this.health = 0;
        }

        if(this.health == 0) {
            System.out.println(getPlayerName()+ " is dead.");
        }
    }

    @Override
    public void damageByGun2() {
        if(armour) {
            this.health -= 40;
            System.out.println("Armour is on. Got hit by Gun 2. Health is reduced by 40. New health is : " +this.health);
        } else {
            this.health -= 50;
            System.out.println("Armour is off. Got hit by Gun 2. Health is reduced by 50. New health is : " +this.health);
        }

        if(this.health <= 0) {
            this.health = 0;
        }

        if(this.health == 0) {
            System.out.println(getPlayerName()+ " is dead.");
        }
    }

    @Override
    public void heal() {
        super.heal();
    }
}

