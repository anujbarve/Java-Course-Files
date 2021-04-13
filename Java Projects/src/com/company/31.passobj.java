package com.company;

class passobj {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Cars Car = new Cars("BMW");
        Cars Car2 = new Cars("Tesla");
        garage.park(Car);
        garage.park(Car2);

    }
}

class Garage {
    void park(Cars car){
        System.out.println("The " + car.name + " is parked");
    }
}

class Cars {
    String name;

    Cars(String name){
        this.name = name;
    }
}