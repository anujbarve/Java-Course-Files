package com.company;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args){
        // methods of mathclass

        // Math.abs
        // Math.min
        // Math.max
        // Math.sqrt
        // Math.round
        // Math.ceil
        // Math.floor

//        Program to find hypo of triangle

        double x,y,z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x :");
        x = scanner.nextDouble();
        System.out.println("Enter side y :");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));

        System.out.println("The Hypo is : " + z);

        scanner.close();
    }
}
