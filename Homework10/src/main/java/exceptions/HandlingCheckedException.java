package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Task:
 * Uncomment code and provide the "try-catch-finally" block
 * to handle a checked exception and close the reader object.
 * 
 * Задача:
 * Раскомментируйте код и предоставьте блок "try-catch-finally"
 * для обработки отмеченного исключения и закрытия reader объекта.
 */
public class HandlingCheckedException {
    public static void main(String[] args) {
        
        final Path folderPath = Paths.get(System.getProperty("user.dir") + "/Homework10/src/main/java/exceptions");
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a file name to read: ");
        String fileName = scanner.nextLine();

        Path fullFilePath = folderPath.resolve(fileName);

        BufferedReader reader = null;

        try {
            reader = Files.newBufferedReader(fullFilePath);

            String nextLine = null;
            nextLine = reader.readLine();

            while (nextLine != null) {
                System.out.println(nextLine);
                nextLine = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
