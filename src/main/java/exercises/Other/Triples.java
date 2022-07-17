package exercises.Other;

import java.util.Arrays;

/**
 * Triples
 *
 * Write a program that reads an array of ints and outputs the number of "triples" in the array.
 *
 * A "triple" is three consecutive ints in increasing order differing by 1
 * (i.e. 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not). Triples may overlap.
 * For example, the sequence 1, 2, 3, 4, 5 contains three triples: 1, 2, 3; 2, 3, 4; and 3, 4, 5.
 *
 * Input data format:
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 *
 * Output data format:
 * Only a single integer value: the number of "triples".
 */

class Triples {

    public static void main(String[] args) {

        int[] testArray_1 = {1}; // 0 triples
        int[] testArray_2 = {1, 2, 3, 4, 5}; // 3 triples
        int[] testArray_3 = {1, 2, 3, 5, 9, 10, 11, 13}; // 2 triples

        System.out.print(Arrays.toString(testArray_1) + " - ");
        System.out.println(countTriples(testArray_1));
        System.out.print(Arrays.toString(testArray_2) + " - ");
        System.out.println(countTriples(testArray_2));
        System.out.print(Arrays.toString(testArray_3) + " - ");
        System.out.println(countTriples(testArray_3) + "\n");

        System.out.print(Arrays.toString(testArray_1) + " - ");
        System.out.println(countTriples_2(testArray_1));
        System.out.print(Arrays.toString(testArray_2) + " - ");
        System.out.println(countTriples_2(testArray_2));
        System.out.print(Arrays.toString(testArray_3) + " - ");
        System.out.println(countTriples_2(testArray_3) + "\n");

    }

    public static int countTriples(int[] array) {
        final int triple = 2;
        int counter = 0;
        int triplesCounter = 0;

        for (int i = 0, j = 1; j < array.length; i++, j++) {
            counter = array[j] - array[i] == 1 ? ++counter : 0;
            if (counter == triple) {
                triplesCounter++;
                counter = 0;
                i--;
                j--;
            }
        }

        return triplesCounter;
    }

    public static int countTriples_2(int[] array) {
        int triples = 0;

        for (int i = 2; i < array.length; i++) {
            if ((array[i] - array[i -1] == 1) && (array[i - 1] - array[i - 2] == 1)) {
                triples++;
            }
        }

        return triples;
    }
}