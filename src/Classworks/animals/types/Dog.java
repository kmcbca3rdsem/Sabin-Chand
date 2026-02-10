package Classworks.animals.types;

import Classworks.animals.base.Animal;

public class Dog extends Animal {

    protected String breed = "unknown";

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Dog is barking!");
    }

    public String getBreed() {
        return breed;
    }
}
