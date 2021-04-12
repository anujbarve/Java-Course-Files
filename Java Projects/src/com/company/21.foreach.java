package com.company;

import java.util.ArrayList;

class Fore {
    public static void main(String[] args) {
        // for each = traversing technique to iterate through the elements in an array/ collection
        // less flexible, more readable
//
//            String[] animals = {"cat", "dog", "rat","bird"};
    ArrayList<String> animal = new ArrayList<String>();

    animal.add("cat");
    animal.add("dog");
    animal.add("rat");
    animal.add("bird");

        for (String i: animal){
            System.out.println(i);
        }
    }
}
