package exercises.JavaRush.level_1_Arrays;

import java.util.Arrays;

/*
 * Некоторые из методов класса Arrays:
 *----------------------------------------------------------------------------------------------------------------------
 * 1. Arrays.toString(arr);            | возвращает «текстовое представление массива».
 *----------------------------------------------------------------------------------------------------------------------
 * 2. Arrays.deepToString(arr);        | возвращает текстовое представление как многомерных массивов,
 *                                     | так и одномерных (не работает с одномерными массивами примитивов)
 *----------------------------------------------------------------------------------------------------------------------
 * 3. Arrays.equals(arr1, arr2);       | сравнивает содержимое одномерных массивов.
 * ---------------------------------------------------------------------------------------------------------------------
 * 4. Arrays.deepEquals(arr1, arr2);   | сравнивает содержимое многомерных массивов.
 * ---------------------------------------------------------------------------------------------------------------------
 * 5. Arrays.fill(arr, value);         | заполняет одномерный массив заданным значением.
 * ---------------------------------------------------------------------------------------------------------------------
 * 6. Arrays.copyOf(arr, length);      | используется для копированя элементов массива, в первом параметре
 *                                     | указывается копируемый массив, во втором длина нового массива, в который будут
 *                                     | скопированы значения.
 *                                     | Если элементы не поместились (длина меньше длины существующего массива),
 *                                     | то лишние значения игнорируются.
 *                                     | Если длина нового массива больше длины старого, ячейки заполняются нулями.
 * ---------------------------------------------------------------------------------------------------------------------
 * 7. Arrays.copyOfRange(arr, x, y);   | используется для копирования заданного диапазона значений массива.
 *----------------------------------------------------------------------------------------------------------------------
 * 8. Arrays.sort(arr);                | сортирует переданный массив по возрастанию.
 *----------------------------------------------------------------------------------------------------------------------
 * 9. Arrays.binarySearch(arr, value); | сортирует, затем ищет заданный элемент в массиве.
 *
 */

public class ArraysClass {

    public static void main(String[] args) {

        //1. Arrays.toString(arr);--------------------------------------------------------------------------------------

        int[] toStringArray = {1, 2, 3, 4, 5};
        String textArray = Arrays.toString(toStringArray);

        // Выведет: [1, 2, 3, 4, 5]
        System.out.println(textArray + "\n");


        //2. Arrays.deepToString(arr);----------------------------------------------------------------------------------

        int[][] deepToStringArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        textArray = Arrays.deepToString(deepToStringArray);

        //Выведет: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        System.out.println(textArray + "\n");

        int[][][] deepToStringArray1 = {{{1}, {2}, {3}}, {{4}, {5}, {6}}, {{7}, {8}, {9}}};
        textArray = Arrays.deepToString(deepToStringArray1);

        //Выведет: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        System.out.println(textArray + "\n");


        //3. Arrays.equals(arr1, arr2);---------------------------------------------------------------------------------

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {5, 6, 7};

        //Выведет: true
        System.out.println(Arrays.equals(array1, array2) + "\n");
        //Выведет: false
        System.out.println(Arrays.equals(array2, array3) + "\n");


        //4. Arrays.deepEquals(arr1, arr2);-----------------------------------------------------------------------------

        String[][] stringArray1 = {{"a"}, {"b"}, {"c"}};
        String[][] stringArray2 = {{"a"}, {"b"}, {"c"}};
        String[][] stringArray3 = {{"c"}, {"b"}, {"a"}};

        //Выведет: true
        System.out.println(Arrays.deepEquals(stringArray1, stringArray2) + "\n");
        //Выведет: false
        System.out.println(Arrays.deepEquals(stringArray2, stringArray3) + "\n");


        //5. Arrays.fill(arr, value);-----------------------------------------------------------------------------------

        int[] emptyArray = new int[5];
        char[] emptyCharArray = new char[5];

        Arrays.fill(emptyArray, 5);
        Arrays.fill(emptyCharArray, 'x');
        //Выведет: [5, 5, 5, 5, 5]
        System.out.println(Arrays.toString(emptyArray) + "\n");
        //Выведет: xxxxx
        System.out.println(Arrays.toString(emptyCharArray) + "\n");

        //Так же с помощью метода Arrays.fill() можно заполнить определенным значением не весь массив, а его часть:
        int[] oneMoreArray = new int[10];

        Arrays.fill(oneMoreArray, 3, 6, 999);
        //Выведет: с помощью метода Arrays.fill() можно заполнить определенным значением не весь массив, а его часть:
        System.out.println(Arrays.toString(oneMoreArray) + "\n");


        //6. Arrays.copyOf(arr, length);--------------------------------------------------------------------------------

        char[] originalArray = {'a', 'b', 'c', 'd', 'e', 'f'};

        char[] copy1 = Arrays.copyOf(originalArray, originalArray.length);
        //Выведет: [a, b, c, d, e, f]
        System.out.println(Arrays.toString(copy1) + "\n");
        char[] copy2 = Arrays.copyOf(originalArray, originalArray.length / 2);
        //Выведет: [a, b, c]
        System.out.println(Arrays.toString(copy2) + "\n");
        char[] copy3 = Arrays.copyOf(originalArray, originalArray.length + 5);
        //Выведет: [a, b, c, d, e, f,  ,  ,  ,  ,  ]
        System.out.println(Arrays.toString(copy3) + "\n");


        //7. Arrays.copyOfRange(arr, x, y);-----------------------------------------------------------------------------

        char[] copy4 = Arrays.copyOfRange(originalArray, 4, 6);

        //Выведет: [e, f]
        System.out.println(Arrays.toString(copy4) + "\n");


        //8. Arrays.sort(arr);------------------------------------------------------------------------------------------

        int[] unsortedArray = {4, 7, 3, 1, 9, 8, 6, 2, 4, 5};

        Arrays.sort(unsortedArray);
        //Выведет: [1, 2, 3, 4, 4, 5, 6, 7, 8, 9]
        System.out.println(Arrays.toString(unsortedArray) + "\n");


        //9. Arrays.binarySearch(arr, value);---------------------------------------------------------------------------

        int[] anotherUnsortedArray = {3, 5, 8, 4, 1, 9, 2, 7, 6};

        int desiredElementIndex = Arrays.binarySearch(anotherUnsortedArray, 1);
        //Выведет: 4
        System.out.println(desiredElementIndex + "\n");
    }
}
