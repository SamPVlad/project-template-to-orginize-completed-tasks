package input;

import java.util.Scanner;

/*
 * Into:
 * Body mass index (BMI) is a value derived from the mass (weight) and height of a person. 
 * The BMI is defined as the body mass divided by the square of the body height, 
 * and is universally expressed in units of kg/m2,
 * resulting from mass in kilograms and height in metres.
 * 
 * Task:
 * Create a basic BMI calculator.
 * The sample output:
 * Your height in m: 1.85
 * Your weight in kg: 77
 * ---------------------
 * Your BMI is 22.5
 */
public class BMICalculator {

    static void BMI(double weight, double height) {
        double BMI = weight / (height * height);
        String resultBMI = String.format("%.1f", BMI);
        System.out.println("\nThe Body Mass Index (BMI) is " + resultBMI + " kg/m2");
    }
    
    public static void main(String[] args) {
        BMI(77, 1.85);
        // your code here
    }
}
