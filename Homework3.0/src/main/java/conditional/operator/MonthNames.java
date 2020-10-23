package conditional.operator;

import java.time.Month;

/**
 * Task:
 * There is the "monthName" method that returns the name of a month by its number.
 * Uncomment the program, and fix the method so that the program compiles and works correctly.
 * Do not forget about handling an incorrect number!
 */
public class MonthNames {
    static String monthName(int numberOfMonth) {
        if (numberOfMonth == 1) {
            return Month.of(1).name();
        } else if (numberOfMonth == 2) {
            return Month.of(2).name();
        } else if(numberOfMonth == 3) {
            return Month.of(3).name();//...
        } else if (numberOfMonth == 4) {
            return Month.of(4).name();
        } else if(numberOfMonth == 5) {
            return Month.of(5).name();//...
        } else if (numberOfMonth == 6) {
            return Month.of(6).name();
        } else if(numberOfMonth == 7) {
            return Month.of(7).name();//...
        } else if (numberOfMonth == 8) {
            return Month.of(8).name();
        } else if(numberOfMonth == 9) {
            return Month.of(9).name();//...
        } else if(numberOfMonth == 10) {
            return Month.of(10).name();
        } else if(numberOfMonth == 11) {
            return Month.of(11).name();
        } else if(numberOfMonth == 12) {
            return Month.of(12).name();
        } else 
            return "Error. Incorrect data entered.";
        //...
    }

    public static void main(String[] args) {
        System.out.println("The month number is 1: " + monthName(1));
        System.out.println("The month number is 2: " + monthName(2));
        System.out.println("The month number is 3: " + monthName(3));
        System.out.println("The month number is 4: " + monthName(4));
        System.out.println("The month number is 5: " + monthName(5));
        System.out.println("The month number is 6: " + monthName(6));
        System.out.println("The month number is 7: " + monthName(7));
        System.out.println("The month number is 8: " + monthName(8));
        System.out.println("The month number is 9: " + monthName(9));
        System.out.println("The month number is 10: " + monthName(10));
        System.out.println("The month number is 11: " + monthName(11));
        System.out.println("The month number is 12: " + monthName(12));
        System.out.println("The month number is 13: " + monthName(13));
        System.out.println("The month number is -1: " + monthName(-1));
        System.out.println("The month number is 1234234: " + monthName(1234234));
    }
}
