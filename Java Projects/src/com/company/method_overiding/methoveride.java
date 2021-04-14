package com.company.method_overiding;

public class methoveride {
    public static void main(String[] args) {

        // allow a child class to have its own implementation
    Dog dog = new Dog();
    dog.speak();
    Animal animal = new Animal();
    animal.speak();
    }
}
