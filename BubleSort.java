import java.util.Arrays;
public class BubleSort{
        public static void bubbleSort(int[] array) {
        System.out.println("METODO BUBBLESORT:");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                System.out.println(Arrays.toString(array));
            }
        }
        System.out.println("VETOR ORDENADO: " + Arrays.toString(array));
    }
}
