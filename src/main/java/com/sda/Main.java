package com.sda;

import model.ImmutablePerson;
import model.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person me = new Person("Feniks", "Shehu", 23);
        System.out.println("Hi, it's me: " + me);

        me.setName("Fenix");
        System.out.println("With changed name: " + me);

        ImmutablePerson meAgain = new ImmutablePerson("Phoenix", "Shehu", 22);
        System.out.println("Me again " + meAgain);

        ImmutablePerson fixedMe= new ImmutablePerson(meAgain.getName(), meAgain.getSurname(), 23);
        System.out.println("Fixed me: " + fixedMe);
    }
}