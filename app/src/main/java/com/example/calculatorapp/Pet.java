package com.example.calculatorapp;

import java.util.ArrayList;

public class Pet {
    public static ArrayList<Pet> petArrayList = new ArrayList<>();
    private String species;
    private int initialAge;
    private int multiplier;

    public Pet(String species, int initialAge, int multiplier) {
        this.species = species;
        this.initialAge = initialAge;
        this.multiplier = multiplier;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getInitialAge() {
        return initialAge;
    }

    public void setInitialAge(int initialAge) {
        this.initialAge = initialAge;
    }

    //populate array list
    public static void popPetArray(){
        Pet smallDog = new Pet("Small Dog", 15, 4);
        petArrayList.add(smallDog);
        Pet averageDog = new Pet("Average Dog", 15, 5);
        petArrayList.add(averageDog);
        Pet bigDog = new Pet("Big Dog", 15, 6);
        petArrayList.add(bigDog);
        Pet indoorCat = new Pet("Indoor Cat", 7, 7);
        petArrayList.add(indoorCat);
        Pet outdoorCat = new Pet("Outdoor Cat", 8, 8);
        petArrayList.add(outdoorCat);
        Pet goldfish = new Pet("Goldfish", 5, 6);
        petArrayList.add(goldfish);
        Pet turtle = new Pet("Turtle", 1, 2);
        petArrayList.add(turtle);
        Pet lizard = new Pet("Lizard", 16, 7);
        petArrayList.add(lizard);
        Pet snake = new Pet("Snake", 18, 6);
        petArrayList.add(snake);
        Pet rat = new Pet("Rat", 52, 33);
        petArrayList.add(rat);
        Pet rabbit = new Pet("Rabbit", 20, 8);
        petArrayList.add(rabbit);
    }

    public ArrayList<Pet> getPetArrayList(){
        return petArrayList;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }
    @Override
    public String toString(){
        return species;
    }
}
