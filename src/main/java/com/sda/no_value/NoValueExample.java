package com.sda.no_value;

import model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class NoValueExample {
    public static void main(String[] args){
        System.out.println("Handling no values");

        for (Person p : somePersons()){
            System.out.println("Person: " + p);
        }
    }

    public static List<Person> somePersons() {
       // return null;
       // return Collections.emptyList();
        return new ArrayList<>();
    }

    public static Person personWithNick(Person person) {
        return null;
    }

    public static Optional<Person> sometimesPersonWithNick(Person person){
        return Optional.of(person);
    }


}
