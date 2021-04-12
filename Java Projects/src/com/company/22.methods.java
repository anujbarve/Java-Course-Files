package com.company;

class methods {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon

        String name = "Anuj";
        int age = 17;
        hello(name,age);

        int z = addnum(2,3);

        System.out.println(z);
    }

    static void hello(String title,int a){
        System.out.println("Hello " + title + " Your age is " + a);
    }

    static int addnum(int x, int y){
        int res = x + y;
        return res;
    }
}
