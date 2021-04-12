package com.company;

class objects {
    public static void main(String[] args) {
        // object = an instance of a class that may contain attributes and methods
        // example : car, person ,etc
        Car mycar = new Car();

        System.out.println(mycar.model);
        System.out.println(mycar.make);
        System.out.println(mycar.year);
        System.out.println(mycar.price);

        mycar.drive();
        mycar.brake();
    }
}

class Car {
 String make = "Agera";
 String model = "One";
 int year = 2020;
 String color = "white";
 double price = 100000.00;

 void drive(){
     System.out.println("you are driving");
 }

    void brake(){
        System.out.println("you stepped on the brake");
    }

}