package com.mohamedmohsen.designpatterns.creational.builder;

class BuilderMain {

    public static void main(String[] args) {

        User.Builder userBuilder = new User.Builder();
        userBuilder.name("Mohamed").email("DevMohamedMohsen@gmail.com").password("********").country("Egypt").city("Cairo").phone("00000000");

        User user = userBuilder.build();
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        System.out.println(user.getCountry());
        System.out.println(user.getCity());
        System.out.println(user.getPhone());
    }
}