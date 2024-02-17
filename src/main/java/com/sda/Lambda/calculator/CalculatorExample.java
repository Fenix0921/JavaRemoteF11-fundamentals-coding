package com.sda.Lambda.calculator;

public class CalculatorExample{

    public static void main(String[] args){
        System.out.println("Let's create calculator and use lambda");
        AddOperation addOperation = (firstArgument, secondArgument) -> firstArgument + secondArgument;
        int result = addOperation.add(1,3);
        System.out.println("result is: " + result);

        AddOperation addOperation1 = (first, second) -> {
            System.out.println("Received first " + first);
            System.out.println("Received second "+ second);

            int sum = first + second;
            System.out.println("Sum is: " + sum);
            return sum;
        };
        addOperation1.add(4, 3);

        SubOperation subOperation = (first, second) -> first - second;

        int result2 = subOperation.sub(10, 2);
        System.out.println("Result is: " + result2);


        DivideOperation divideOperation = (first, second) -> first / second;

        int result3 = divideOperation.divide(16, 4);
        System.out.println("Result 3 is: " + result3);

        MultiplyOperation multiplyOperation = (first, second) -> first * second;

        int result4 = multiplyOperation.multiply(7, 3);
        System.out.println("Result 4 is: " + result4);


        System.out.println("Calculator operations");
        CalculatorOperations calculatorOperations = (a, b) -> {
            try {
                return  a/ b;
            } catch (ArithmeticException e){
                return 0;
            }

        };

        calculatorOperations.div(4, 2);
        int result5 = calculatorOperations.div(4, 0);
        System.out.println("result 5 is: " + result5);

        CalculatorOperations calculatorOperations1 = (a, b) -> {
            if (b==0){
                System.out.println("Wrong argument provided!!");
                throw new WrongArgumentException("Cannot divide by 0!!!");
            }
            return a/b;
        };
        try {
            calculatorOperations.div(5, 0);
        } catch (WrongArgumentException e) {
            System.out.println("My fault :)" );
        }

    }
}
