package com.selfstudy;

public class Animal {

    private String animalName;
    private int brain;
    private int weight;


    public Animal(String animalName, int brain, int weight) {
        this.animalName = animalName;
        this.brain = brain;
        this.weight = weight;
    }

    public void eat() {

    }

    public String getAnimalName() {
        return animalName;
    }

    public int getBrain() {
        return brain;
    }

    public int getWeight() {
        return weight;
    }

}
