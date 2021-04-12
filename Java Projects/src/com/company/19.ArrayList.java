package com.company;
import  java.util.ArrayList;
class ArrayLis {
    public static void main(String[] args) {
//        ArrayList = a resizable Array
//        elements can be added and removed after compilation phase store reference data types
            ArrayList<String> food = new ArrayList<String>();

            food.add("pizza");
            food.add("hamburger");
            food.add("hotdog");

            food.set(4,"Sushi");
            food.remove(4);
            food.clear();

            for (int i = 0; i < food.size(); i++){
                System.out.println(food.get(i));
            }
    }
}
