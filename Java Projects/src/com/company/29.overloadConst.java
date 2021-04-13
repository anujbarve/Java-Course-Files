package com.company;

class overloadConst {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thick crust","tomato","cheddar","pepparoni");
        System.out.println("The ingredients of pizza are:");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        System.out.println();

        Pizza pizza2 = new Pizza("thick crust","tomato","cheddar");
        System.out.println("The ingredients of pizza are:");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);

        System.out.println();

        Pizza pizza3 = new Pizza("thick crust","tomato");
        System.out.println("The ingredients of pizza are:");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
    }
}

class Pizza{

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread,String sauce,String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    Pizza(String bread,String sauce,String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread,String sauce){
        this.bread = bread;
        this.sauce = sauce;
    }

}