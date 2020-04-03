package com.miron4dev;

public class SomeClass {

    public static void main(String[] args) {
        User user = new User("testUser", "testEmail@example.com", null);

        System.out.println(user);
    }

    public void doSmth() {
        System.out.println("Inside java method");
    }
}
