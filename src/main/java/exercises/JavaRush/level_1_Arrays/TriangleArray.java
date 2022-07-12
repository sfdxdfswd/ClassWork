package exercises.JavaRush.level_1_Arrays;

/*
 * Создай треугольный массив, где значение каждого элемента — это сумма его индексов. Например:
 * array[7][3] = 7 + 3 = 10,
 * array[3][0] = 3 + 0 = 3.
 *
 * Выведи массив на экран в следующем виде:
 * 0
 * 1 2
 * 2 3 4
 *  3 4 5 6
 * 4 5 6 7 8
 * 5 6 7 8 9 10
 * ...
 * Числа в строке разделены пробелом.
 */

public class TriangleArray {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {

        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
        }

        for (int i = 0; i < result.length; i++) {
            for (int k = 0; k < result[i].length; k++) {
                result[i][k] = i + k;
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int k = 0; k < result[i].length; k++) {
                System.out.print(result[i][k] + " ");
            }
            if (i < result.length -1) {
                System.out.println();
            }
        }
    }
}
