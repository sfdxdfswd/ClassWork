package exercises.JavaRush.level_1_Arrays;

/*
 * Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10],
 * заполни его таблицей умножения и выведи в консоли в следующем виде:
 *   1 2 3 4 …
 *   2 4 6 8 …
 *   3 6 9 12 …
 *   4 8 12 16 …
 *   …
 * Числа в строке разделены пробелом.
 */

public class MultiplicationTable {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {

        MULTIPLICATION_TABLE = new int[10][10];

        for (int row = 0; row < MULTIPLICATION_TABLE.length; row++) {
            for (int col = 0; col < MULTIPLICATION_TABLE.length; col++) {
                if (row == 0) {
                    MULTIPLICATION_TABLE[row][col] = col + 1;
                }
                MULTIPLICATION_TABLE[row][col] = (row + 1) * (col + 1);
            }
        }

        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int k = 0; k < MULTIPLICATION_TABLE.length; k++) {
                System.out.print(MULTIPLICATION_TABLE[i][k] + " ");
            }
            if (i < MULTIPLICATION_TABLE.length - 1) {
                System.out.println();
            }
        }
    }
}
