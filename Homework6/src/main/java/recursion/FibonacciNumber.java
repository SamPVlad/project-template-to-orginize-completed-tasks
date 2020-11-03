package io.github.valentyn.nahai.oop.recursion;

/**
 * Task:
 * Create a method that calculates fibonacci number using recursion.
 * The base formula is F(n) = F(n - 1) + F(n - 2).
 * 
 * Задача:
 * Создайте метод, который вычисляет число Фибоначчи с помощью рекурсии.
 * Базовая формула: F (n) = F (n - 1) + F (n - 2).
 */
public class FibonacciNumber {

    public static int fibonacciNumber(int number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
    }
    
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(10));
        for (int counter = 0; counter <= 10; counter++){
            System.out.printf("Fibonacci of %d is: %d\n",
                counter, fibonacciNumber(counter));
        }
    }
}
