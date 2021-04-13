package com.company;

class arrayofobj {
    public static void main(String[] args) {

        // convectional arrays
        int [] number = new int[3];
        char[] chars = new char[4];
        String[] strings = new String[5];

        // array of objects

        Food food1 = new Food("pizza");
        Food food2 = new Food("burger");
        Food food3 = new Food("hotdog");

        Food[] fridge = {food1,food2,food3};

        System.out.println(fridge[0].name + " " + fridge[1].name + " " + fridge[2].name );
    }
}

class Food{
    String name;
    Food(String name){
        this.name = name;
    }
}