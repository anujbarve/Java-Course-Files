package com.company;

public class Array {
    public static void main(String[] args){
        // array can used to multiple values of same type in a single variable

//        String[] cars = {"Camaro","Corvette","Tesla","BMW"};
//
//        cars[0] = "Mustang";

        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
