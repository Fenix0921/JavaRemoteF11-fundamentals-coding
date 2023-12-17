
/*Write a simple “echo” application, that will:
print back entered string,
go to the beginning of a loop if user will enter “continue”,
break the loop with a “good bye!” message, if user will enter “quit”.*/

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("\n\nFibonacci Series: \nEnter an Integer:");
                int inputF = scanner.nextInt();
                Fibonacci fibonacci = new Fibonacci();
                fibonacci.printFibonacciSeries(inputF);
            }
        }

