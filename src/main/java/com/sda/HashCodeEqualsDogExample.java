package com.sda;


import model.Dog;

public class HashCodeEqualsDogExample {
    public static void main(String[] args) {
        Dog azor = new Dog("Azor", 1);
        System.out.println("My dog: " + azor);

        Dog anotherAzor = new Dog("Terry", 1);
        System.out.println("Another azor: " + anotherAzor);

        Dog azor2 = azor;
        System.out.println("Is azor2 == azor: " + (azor2 == azor));

        System.out.println("Is another Azor == azor: " + (anotherAzor == azor));
    }
}
