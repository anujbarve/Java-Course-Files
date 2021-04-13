package com.company.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        // inheritance = the process of inheriting the atributes/ methods of a class

        Carss car = new Carss();
        Bicycle bicycle = new Bicycle();

        car.go();
        System.out.println(car.doors);
        System.out.println(bicycle.paddles);
    }
}

class Vehicle{

     void go(){
        System.out.println("this vehicle is moving");
    }

     void stop(){
        System.out.println("this vehicle is moving");
    }
}

class Carss extends Vehicle{
int wheels = 4;
int doors = 4;
}

class Bicycle extends Vehicle{
    int wheels = 2;
    int paddles = 2;
}