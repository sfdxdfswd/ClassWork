package JavaRush.javaSyntaxZero;

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
