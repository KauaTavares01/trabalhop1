import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        System.out.println("METODO SELECTIONSORT:");
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            System.out.println(Arrays.toString(array));
        }
        System.out.println("VETOR ORDENADO: " + Arrays.toString(array));
    }
}
