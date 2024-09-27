import java.util.Arrays;

public class InserctionSort {
    public static void insertionSort(int[] array) {
        System.out.println("METODO INSERTIONSORTt:");
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
            System.out.println(Arrays.toString(array));
        }
        System.out.println("VETOR ORDENADO: " + Arrays.toString(array));
    }
}
