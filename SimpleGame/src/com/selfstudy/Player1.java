package com.selfstudy;

public class Player1 {
    private String playerName;
    private String weapon;
    private int health;

    public Player1(String playerName, String weapon, int health) {
        this.playerName = playerName;
        this.weapon = weapon;
        this.health = health;
    }

    public void damageByGun1() {
        this.health -= 30;
        System.out.println("Got hit by Gun 1. Health is reduced by 30. New health is : " +this.health);

        if(this.health <= 0) {
            this.health = 0;
        }

        if(this.health == 0) {
            System.out.println(getPlayerName()+ " is dead.");
        }
    }

    public void damageByGun2() {
        this.health -= 50;
        System.out.println("Got hit by Gun 2. Health is reduced by 50. New health is : " +this.health);

        if(this.health <= 0) {
            this.health = 0;
        }

        if(this.health == 0) {
            System.out.println(getPlayerName()+ " is dead.");
        }
    }

    public void heal() {
        if(this.health <= 0) {
            System.out.println(getPlayerName()+ " is dead. Heal is not possible.");
        } else {
            this.health = 60;
            System.out.println("Health is now : " +this.health);
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }
}
