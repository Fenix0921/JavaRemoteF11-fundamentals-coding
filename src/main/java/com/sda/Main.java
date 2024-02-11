package com.sda;

import model.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person me = new Person("Feniks", "Shehu", 23);
        System.out.println("Hi, it's me: " + me);
    }
}