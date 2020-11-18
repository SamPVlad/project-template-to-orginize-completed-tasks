package exceptions;

/**
 * Task:
 * Handle a runtime exception to finish the program correctly.
 * Use the "try-catch" block.
 * 
 * Задача:
 * Обработка исключения времени выполнения для правильного завершения программы.
 * Используйте блок "try-catch".
 */
public class HandlingArithmeticException {
    public static void main(String[] args) {

        final int dividend = 6;
        final int divisor = 0;
        try {
            final int quotient = dividend / divisor;
            System.out.println("Quotient of " + dividend + " / " + divisor + " = " + quotient);
        } catch(RuntimeException e) {
            System.out.println("Error. Divided by 0");
        } 
      
    }
}
