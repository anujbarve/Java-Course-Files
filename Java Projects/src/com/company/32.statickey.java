package com.company;

class statickey {
    public static void main(String[] args) {
        // static = a single copy of a variable/method is created and shared
//        the class "owns" the static member
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");

        Friend.displayFriends();
    }
}

class Friend{
    String name;

    static int num_of_friends;
    Friend(String name){
        this.name = name;
        num_of_friends++;
    }

    static void displayFriends(){
        System.out.println("You have " + num_of_friends + " Friends");
    }
}