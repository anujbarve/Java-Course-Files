package com.company;

class array2d {
    public static void main(String[] args){
        // 2d array = arrays of arrays

//        String[][] cars = new String[3][3];
//
//        cars[0][0] = "Tesla";
//        cars[0][1] = "Camora";
//        cars[0][2] = "Silverado";
//
//        cars[1][0] = "Mustang";
//        cars[1][1] = "Ranger";
//        cars[1][2] = "F-150";
//
//        cars[2][0] = "Ferrai";
//        cars[2][1] = "Lambo";
//        cars[2][2] = "GTR";

        String[][] cars = {{"Tesla","Camora","Silverado"},{"Mustang","Ranger","F-150"},{"Ferrai","Lambo","GTR"}};


        for (int i = 0; i< cars.length;i++){
            System.out.println();
            for (int j = 0; j < cars[i].length; j++){
                System.out.println(cars[i][j]);
            }
        }
    }
}
