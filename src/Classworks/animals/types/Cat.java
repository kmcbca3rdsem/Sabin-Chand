package Classworks.animals.types;

import Classworks.animals.base.Animal;

public class Cat extends Animal {

    protected String breed = "unknown";

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void meow(){
        System.out.println("Cat is meowing:");
    }

    public String getBreed(){
        return breed;
    }
}
