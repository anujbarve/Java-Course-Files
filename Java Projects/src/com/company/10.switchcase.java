package com.company;

class switchcase {
    public static void main(String[] args){
        String day = "Friday";

        switch (day){
            case "Sunday": System.out.println("It is Sunday"); break;
            case "Monday": System.out.println("It is Monday"); break;
            case "Friday": System.out.println("It is Friday"); break;
            default:
                System.out.println(day + " is not a day");
        }
    }
}
