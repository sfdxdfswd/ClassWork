package JavaRush.javaSyntaxZero;
import java.util.Scanner;

/**
 *    Удаляем одинаковые строки в массиве
 */

class DeleteEqualsStringsFromArray {
  private static String[] strings;

    public static void main(String[] args) {

        strings = new String[6];
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter 6 words, identical words will be replaced by null");

        for (int i = 0; i < strings.length; i++) {
            System.out.print("Word" + (i + 1) + ": ");
            strings[i] = scn.nextLine();
        }

        boolean delEl = false;

        for (int i = 0; i < strings.length; i++) {

            if (delEl) {
                strings[i - 1] = null;
                delEl = false;
            }

            for (int k = 1; k < strings.length; k++) {
                if (strings[k] == null || strings[i] == null || i == k) {
                    continue;
                }
                if (strings[i].equals(strings[k])) {
                    strings[k] = null;
                    delEl = true;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}