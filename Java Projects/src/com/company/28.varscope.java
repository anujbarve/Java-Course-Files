package com.company;

import java.util.Random;

class varscope {
    public static void main(String[] args) {
        // local var = declared inside a method visible only to that method
        // global var = declared outside a method, but withing a class, visible to all parts of code
        Diceroller diceroller = new Diceroller();
    }
}

class Diceroller{

    // global
    Random random;
    int number;
    Diceroller(){
        random = new Random();
        number = 0;
        roll();
    }

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}