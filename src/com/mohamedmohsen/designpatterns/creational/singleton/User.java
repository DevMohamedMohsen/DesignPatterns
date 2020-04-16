package com.mohamedmohsen.designpatterns.creational.singleton;

class User {

    // volatile is to ensure that instance will remain a singleton through any of the changes inside of the JVM
    private static volatile User instance;

    private User() {
        // Reflection Safe
        if (instance != null) {
            throw new RuntimeException("Use getInstance() to create");
        }
    }

    public static User getInstance() {
        // Lazy Loading
        if (instance == null) {

            // Thread Safe
            synchronized (User.class) {

                if (instance == null) {
                    instance = new User();
                }
            }
        }
        return instance;
    }
}