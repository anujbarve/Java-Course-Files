package com.company;

import java.util.ArrayList;

class ArrayLis2d {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> ProduceList = new ArrayList();
        bakeryList.add("tomatoes");
        bakeryList.add("zucchni");
        bakeryList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        bakeryList.add("soda");
        bakeryList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(ProduceList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(0).get(0));

    }
}
