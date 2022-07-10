package JavaRush.javaSyntaxZero;

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
