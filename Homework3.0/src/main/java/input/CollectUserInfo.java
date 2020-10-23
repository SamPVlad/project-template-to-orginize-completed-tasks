package input;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Task:
 * Collect user info like their names, age, marriage status, insurance ID, total income in a year, etc.
 * You can use as an example from the ScannerUsageExample class.
 * You must use the most appropriate type for each variable and not just Strings for everything.
 * Do be shy to check other info out in the internet.
 */
public class CollectUserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean isMarried;
        byte age;
        int insuranceId;
        double yearIncomeInDollars;
        String firstName;

        try {
            System.out.print("What is your first name? Type a string: ");
            firstName = scanner.next();
            
            System.out.println("What is your age? (0 - 127): ");
            age = scanner.nextByte();
            
            System.out.println("Hi, how are you? I have some questions about you.");
            System.out.println("Are you married? (true, false): ");
            isMarried = scanner.nextBoolean();

            System.out.println("What is your insurance ID? (0 - " + Integer.MAX_VALUE + "): ");
            insuranceId = scanner.nextInt();

            System.out.println("What is your year income? (0.0 - 9000000.00)");
            yearIncomeInDollars = scanner.nextDouble();



            System.out.println("\n---------------------");
            System.out.println("Your info:");

            System.out.println("The first name: " + firstName);
            System.out.println("Age: " + age);
            System.out.println("Marriage: " + isMarried);
            System.out.println("Insurance ID: " + insuranceId);
            System.out.println("Year income: " + yearIncomeInDollars + "$");
        } catch (InputMismatchException ex) {
            System.out.println("You have entered an incorrect value! Try to use one that limited in each output message.");
        }
        // your code here
    }
}
