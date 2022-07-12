package exercises.JavaRush.level_1_Arrays;
import java.lang.Math;
import java.util.Arrays;

//Ragged array example

public class RaggedArray {

    public static void main(String[] args) {

        int arrLen;
        char[][] raggedArray = new char[24][];

        for (int i = 0; i < raggedArray.length; i++) {
            arrLen = (int)(Math.random() * 81);
            System.out.print(arrLen + "  ");
            raggedArray[i] = new char[arrLen];
        }

        System.out.println("\n");

        for (char[] value : raggedArray) {
            Arrays.fill(value, '|');
        }

        for (char[] chars : raggedArray) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
}
