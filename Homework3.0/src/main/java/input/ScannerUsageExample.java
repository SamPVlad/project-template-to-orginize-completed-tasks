package input;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * This example demonstrates the possibility of reading
 * primitive type, string based values from input stream.
 * Task:
 * Launch it. Familiarize yourself with the API of the Scanner class.
 */
public class ScannerUsageExample {
    public static void main(String[] args) {
        // Declare the object of the Scanner class and use System.in as an input stream 
        Scanner scanner = new Scanner(System.in);

        // Declare variables of all the possible primitive types
        boolean isMarried;
        byte age;
        short bodyHeightInCentimeters;
        int insuranceId;
        long taxId;
        float bodyWeightInKilograms;
        double yearIncomeInDollars;
        char firstLetterOfName;
        String firstName;

        try {
            System.out.println("Hi, how are you? I have some questions about you.");
            System.out.println("Are you married? (true, false): ");
            isMarried = scanner.nextBoolean();

            System.out.println("What is your age? (0 - 127): ");
            age = scanner.nextByte();

            System.out.println("What is your body height in centimeters (30 - 250): ");
            bodyHeightInCentimeters = scanner.nextShort();

            System.out.println("What is your insurance ID? (0 - " + Integer.MAX_VALUE + "): ");
            insuranceId = scanner.nextInt();

            System.out.println("What is your tax ID? (0 - " + Long.MAX_VALUE + "): ");
            taxId = scanner.nextLong();

            System.out.println("What is your body weight in kilograms? (4.0 - 200.0): ");
            bodyWeightInKilograms = scanner.nextFloat();

            System.out.println("What is your year income? (0.0 - 9000000.00)");
            yearIncomeInDollars = scanner.nextDouble();

            System.out.print("What is the first letter of your first name? Type only one letter: ");
            firstLetterOfName = scanner.next().charAt(0);

            System.out.print("What is your first name? Type a string: ");
            firstName = scanner.next();

            System.out.println("\n---------------------");
            System.out.println("Your info:");
            
            System.out.println("Marriage: " + isMarried);
            System.out.println("Age: " + age);
            System.out.println("Body height: " + bodyHeightInCentimeters);
            System.out.println("Insurance ID: " + insuranceId);
            System.out.println("Tax ID: " + taxId);
            System.out.println("Body weight: " + bodyWeightInKilograms);
            System.out.println("Year income: " + yearIncomeInDollars + "$");
            System.out.println("The first letter of the name: " + firstLetterOfName);
            System.out.println("The first name: " + firstName);
        } catch (InputMismatchException ex) {
            System.out.println("You have entered an incorrect value! Try to use one that limited in each output message.");
        }
    }
}
