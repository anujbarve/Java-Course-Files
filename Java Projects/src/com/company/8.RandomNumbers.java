package com.company;
import java.util.Random;
class RandomNumbers {
    public static void main(String[] args){
        Random random = new Random();

//        int x = random.nextInt(6) + 1;
//        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(z);
    }
}
