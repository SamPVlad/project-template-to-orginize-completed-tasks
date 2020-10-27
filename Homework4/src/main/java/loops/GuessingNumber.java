package loops;

import java.util.Scanner;

/*
 * Task:
 * Create a program that will set a random secret number, ask the user to input a guess number,
 * and keep printing the prompt message until the number is revealed.
 * Use do-while loop.
 * 
 * Создайте программу, которая будет задавать произвольное секретое число, спрашивать пользователя ввести
 * число для одгадывания, продолжать печатать приглашения для ввода, пока число не будет раскрыто.
 * Используйте do-while цикл.
 */
public class GuessingNumber {
    public static void main(String[] args) {

        int secretNumber = (int) (Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the secret number. Input your variant");
        boolean isSecretNumber;
        
        
        do {
            
            System.out.println("Wrong. Try again!");
            int number = scanner.nextInt();
            isSecretNumber = (number == secretNumber) ? false: true;
            
        } while (isSecretNumber);
        System.out.println("Thank you!");
    }
}

