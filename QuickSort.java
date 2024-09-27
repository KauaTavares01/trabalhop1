import java.util.Arrays;

public class QuickSort {
    public static void quicksort(int[] arr) {
        System.out.println(" METODO QUICKSORT:");
        quicksort(arr, 0, arr.length - 1);
    }

    public static void quicksort(int[] arr, int low, int high) {
        while (low < high) {
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot - 1);
            low = pivot + 1;
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= j && arr[i] <= pivot) {
                i++;
            }

            while (i <= j && arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println("VETOR ORDENADO: " + Arrays.toString(arr));

        arr[low] = arr[j];
        arr[j] = pivot;

        return j;

    }
}
