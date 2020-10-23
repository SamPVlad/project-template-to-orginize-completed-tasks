package multibranch.operator;

import java.util.Scanner;

/**
 * Task:
 * Create a program that output the type of a week day according to its number.
 * The number of the week day the user should be able to specify in the input.
 * Use Scanner class to read input stream from the keyboard.
 * Your solution MUST include the usage of the "switch" operator. 
 * Try to use "case" branches in the most effective way.
 * Assume for this task that there are only 2 type: working and weekend days.
 */
public class TypesOfWeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type of a week day according to its number");
        int dayOfTheWeek = scanner.nextInt();
        String typeOfWeekDay;
        
        switch (dayOfTheWeek) {
            case 1: 
            case 2: 
            case 3:  
            case 4:
            case 5:  typeOfWeekDay = "working day";
                break;
            case 6:
            case 7:  typeOfWeekDay = "weekend day";
                break;
            default: typeOfWeekDay = "Error";
                break;
        }
        System.out.println(typeOfWeekDay);// your code here
    }
}
