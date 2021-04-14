package com.company.superkeyword;

public class superkey {
    public static void main(String[] args) {
//        super = refers to the superclass(parent) class
//        similar to "this" keyword but this refers to the same class but super refers to the parent
        Hero hero1 = new Hero("Batman",20,"$$$");

        System.out.println(hero1.name + " " + hero1.age + " " + hero1.powers);
    }
}
