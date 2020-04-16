package com.mohamedmohsen.designpatterns.creational.singleton;

class SingletonMain {

    public static void main(String[] args) {

        User user = User.getInstance();
        System.out.println(user);

        User user2 = User.getInstance();
        System.out.println(user2);
    }
}