package com.sda.Lambda.calculator;
@FunctionalInterface

public interface CalculatorOperations {
    default int add(int a, int b){
        return a + b;
    }

    default int sub(int a, int b){
        return a - b;
    }
    default int multiply(int a, int b){
        return a * b;
    }
    int div(int a, int b);
}
