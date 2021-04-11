package com.company;

import java.util.Scanner;

public class LogicalOp {
    public static void main(String[] args){
        // && AND both must true
//        int temp = 31;
//
//        if (temp>30){
//            System.out.println("it is hot outside");
//        }else if(temp>=20 && temp <=30){
//            System.out.println("it is warm outside");
//        }else{
//            System.out.println("it is cold");
//        }

        // || OR  either must be true

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("You are playing a game Press Q/q to exit");
//
//        String response = scanner.next();
//
//        if (response.equals("q") || response.equals("Q")){
//            System.out.println("You Quit the game");
//        }else{
//            System.out.println("Still in the game");
//        }

        // ! NOT  not equal

                Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game Press Q/q to exit");

        String response = scanner.next();

        if (!response.equals("q") && !response.equals("Q")){
            System.out.println("Still in the game");
        }else{
            System.out.println("You are quitting");
        }


    }
}
