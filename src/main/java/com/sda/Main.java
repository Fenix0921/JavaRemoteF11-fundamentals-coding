package com.sda;

import model.ImmutablePerson;
import model.Person;
import model.PersonRecord;

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

        System.out.println("Let's play with records");
        PersonRecord record = new PersonRecord("Niksi", "Shehu", 22);
        System.out.println("Record person: " + record);
        System.out.println("Just name: " + record.name());
        System.out.println("Just surname: " + record.surname());
        System.out.println("Just age: " + record.age());
        System.out.println("My new method in action: " + record.nameWithSurname());
    }
}