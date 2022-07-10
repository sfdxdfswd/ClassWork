package JavaRush.javaSyntaxZero;
import java.util.Scanner;

/**
 *   Удаляем одинаковые строки в массиве.
 *   В этой задаче тебе нужно:
 *   Считать 6 строк и заполнить ими массив strings.
 *   Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
 *
 *   #отсебятина#: Создать новый массив newStrings хранящий значения strings не равные null,
 *   длина нового массива равна количесву таких значений.
 */

class DeleteEqualsStringsFromArray {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String[] strings = new String[6];
        int newStringsLen = 0;
        int newStringsIndex = 0;
        boolean delEl = false;

        System.out.println("Enter 6 words, identical words will be replaced by null");
        //Заполняем массив строками
        for (int i = 0; i < strings.length; i++) {
            System.out.print("Word" + (i + 1) + ": ");
            strings[i] = scn.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            if (delEl) {
                strings[i - 1] = null;
                delEl = false;
            }
            //Во вложенном цикле элемент массива [i] поочередно сравнивается с элементами [k],
            //если есть [k] элементы равные [i], их значения заменяются на null
            //и флаг delEl устанавливается на true, чтобы выйдя из вложенного цикла
            //заменить элемент [i] - 1 (по которому происходило сравнение) на null.
            for (int k = 1; k < strings.length; k++) {
                if ((strings[k] == null) || (strings[i] == null) || (i == k)) {
                    continue;
                }
                if (strings[i].equals(strings[k])) {
                    strings[k] = null;
                    delEl = true;
                }
            }
        }

        System.out.println("Result:");
        for (String string : strings) {
            System.out.print(string + "  ");
        }

        //После замены одинаковых значений на null, значения не равные null будут помещены
        //в новый массив. Длина нового массива будет равна длине исходного минус количество null элементов.
        for (String str: strings) {
            if (str != null)
                newStringsLen++;
        }

        if (newStringsLen == 0) {
            System.out.println("\nAll words was deleted");
        } else {
            String[] newStrings = new String[newStringsLen];
           //Элементы не равные null помещаются в новый массив.
            for (String str : strings) {
                if (str != null) {
                    newStrings[newStringsIndex] = str;
                    newStringsIndex++;
                }
            }

            System.out.println("\nNew array without deleted words: ");

            for (String str : newStrings) {
                System.out.print(str + "  ");
            }
        }
    }
}