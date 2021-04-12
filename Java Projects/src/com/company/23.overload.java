package com.company;

class overload {
    public static void main(String[] args) {
        // overloading methods = methods that share the same name but have different parameters
        System.out.println(add(2,2));
        System.out.println(add(2.4,3.4));
        System.out.println(add(1,4,5));
    }

    static int add(int a,int b){
        System.out.println("This is overloaded method 1");
        return a + b;
    }

    static double add(double a,double b){
        System.out.println("This is overloaded method 2");
        return a + b;
    }

    static int add(int a,int b, int c){
        System.out.println("This is overloaded method 3");
        return a + b + c;
    }
}
