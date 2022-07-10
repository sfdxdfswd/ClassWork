package JavaRush.javaSyntaxZero;
import java.util.Arrays;

/**
 * Реализуй статический метод main(String[]), который заполняет массив array значениями valueStart и valueEnd.
 * Если длина массива четная, его первую половину нужно заполнить значениями valueStart,
 * а вторую — valueEnd. Если длина массива нечётная, то первую большую часть заполнить значениями valueStart,
 * вторую меньшую — valueEnd. Для заполнения массива используй метод Arrays.fill(int[], int, int, int).
 */

public class ArrayFillMethod {

 /**   public static int[] array = new int[5];
    public static int valueStart = 10;
    public static int valueEnd = 13;
*/
    public static void main(String[] args) {

 /**       if (array.length % 2 == 0) {
            Arrays.fill(array, 0, (array.length / 2) , valueStart);
            Arrays.fill(array, array.length / 2, array.length, valueEnd );
        }else {
            Arrays.fill(array, 0, (array.length / 2 + 1 ) , valueStart);
            Arrays.fill(array, array.length / 2 + 1, array.length, valueEnd );
        }
        System.out.println(Arrays.toString(array));
*/
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arrCopy = {1,2,3,4,5,6,7,8,9};
        int[][] arr1 = {{1,2,3},{4,5,6}};
        int[][] arr1Copy = {{1,2,3},{4,5,6}};
        //методы класса Arrays;
        System.out.println("1:  " + Arrays.toString(arr));
        System.out.println("2:  " + Arrays.deepToString(arr1));
        System.out.println("3:  " + Arrays.equals(arr, arrCopy));
        System.out.println("4:  " + Arrays.deepEquals(arr1, arr1Copy));
        Arrays.fill(arr, 55);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 1, arr.length - 1, 0 );
        System.out.println(Arrays.toString(arr));
        arrCopy = Arrays.copyOf(arr, 9);
        System.out.println(Arrays.toString(arrCopy));
        int[] newArr = Arrays.copyOfRange(arr, 5, 7);
        System.out.println(Arrays.toString(newArr));
    }
}








