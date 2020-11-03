package io.github.valentyn.nahai.oop.method.overloading;

/**
 * Task:
 * Create overloaded methods for summarizing and printing 2 numbers of different types as many as you want.
 * These methods can be static and declared in the class with the "main" method.
 * 
 * Задание:
 * Создайте перегруженные методы для суммирования и печати 2 чисел разных типов.
 * Эти методы могут быть статическими и объявляться в классе с "main" методом.
 */
public class MethodOverloading {
    public static void main(String[] args) {
        sumAndPrint(4, 5);
        sumAndPrint(6.7, 4.5);
        sumAndPrint(6, 4.5);
        sumAndPrint("stringType+double", 4.5);
    }
    
    public static void sumAndPrint(int firstNumber, int secondNumber) {
        System.out.println("The sum of 2 integer values is " + (firstNumber + secondNumber));
    }

    public static void sumAndPrint(double firstNumber, double secondNumber) {
        System.out.println("The sum of 2 double values is " + (firstNumber + secondNumber));
    }
    
    // ...

    public static void sumAndPrint(int firstNumber, double secondNumber) {
        System.out.println("The sum of 1 double value and 1 integer value is " + (firstNumber + secondNumber));
    }

    public static void sumAndPrint(String firstNumber, double secondNumber) {
        System.out.println("The sum of 2 double values is " + (firstNumber + secondNumber));
    }
}
