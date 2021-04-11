package com.company;

import java.util.Scanner;

class Whileloop {
    public static void main(String[] args){
        // while loop continues a block until true

//        Scanner scanner = new Scanner(System.in);
//
//        String name = "";
//
//        while(name.isBlank()){
//            System.out.println("Enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        System.out.println("Hello " + name);

        // do while executes the loop once whether the condition is true or not

                Scanner scanner = new Scanner(System.in);

        String name = "";

        do{
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }while(name.isBlank());

        System.out.println("Hello " + name);

    }
}
