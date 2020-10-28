package arrays;

/**
 * Task:
 * Create a program that will print a table 100 x 100 size of random numbers.
 * Use a two dimensions array to store numbers and the "for loop" to output them.
 * 
 * Создайте программу, которая будет печатать таблицу 100 x 100 размера произвольный чисел.
 * Используйте 2-х мерный массив чтобы хранить числа и "for loop" для их вывода.
 */
class BasicArray {
    public static void main(String[] args) {
        int[][] table = new int[100][100];
        int i, j = 0;

        for (i = 0; i < 100; i++) {

            for (j = 0; j < 100; j++) {
                table[i][j] = (int) ( Math.random() * 100 );
                System.out.print(table[i][j] + " ");
            }// ...
            System.out.println("");
        }
    }
}
