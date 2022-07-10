package JavaRush.javaSyntaxZero;
import java.lang.Math;


public class RaggedArray {

    public static void main(String[] args) {
        int arrLen;
        char[][] raggedArray = new char[300][];

        for (int i = 0; i < raggedArray.length; i++) {
            arrLen = (int)(Math.random() * 121);
            System.out.print(arrLen + "  ");
            raggedArray[i] = new char[arrLen];
        }

        System.out.println("\n");

        for (int i = 0; i < raggedArray.length; i++) {
            for (int k = 0; k < raggedArray[i].length; k++) {
                raggedArray[i][k] = '|';
            }
        }

        for (int i = 0; i < raggedArray.length; i++) {
            for (int k = 0; k < raggedArray[i].length; k++) {
                System.out.print(raggedArray[i][k]);
            }
            System.out.println();
        }
    }
}
