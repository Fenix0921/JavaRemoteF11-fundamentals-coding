package com.sda.stream;

import model.Person;
import java.util.ArrayList;

public class StreamExample {
    public static void main(String[]args){
        System.out.println("Let's play with streams");

        var persons = new ArrayList<Person>();
        persons.add(
                new Person("John", "Doe", 21)
        );
        persons.add(new Person("Erik", "Cantona", 8));
        persons.add(new Person("Mikolaj", "Kopernik", 55));

        var onlyAdults = persons.stream()
                .filter(person -> person.getAge() >= 18)
                .toList();
        System.out.println("Adults " + onlyAdults);
        System.out.println("Persons " + persons);

        var kids = persons.stream()
                .filter(person -> {
                    System.out.println("Filtering person: " + person);
                    return person.getAge() < 18;
                })
                .filter(person -> {
                    System.out.println("Leaving just kids that name starts with B letter");
                    return person.getName().startsWith("B");
                })
                .toList();

        // get names of only adults
        var justNames = persons.stream()
                .filter(person -> {
                    System.out.println("\nChecking if person is adult..." + person);
                    return person.getAge() >= 18;
                })
                .map(person -> {
                    person.setName(person.getName() + 1);
                    return person;
                })
                .map(person -> {
                    System.out.println("Mapping person to name: " + person);
                    return person.getName();
                })
                .toList();

        System.out.println("Adults are : " + justNames);

    }
}

