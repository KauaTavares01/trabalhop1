import java.util.Arrays;

public class HeapSort {
    public static void heapsort(int[] arr) {
        System.out.println(" METODO HEAPSORT:");
        buildMaxHeap(arr);
        int end = arr.length - 1;
        while (end > 0) {
            swap(arr, 0, end);
            end--;
            heapify(arr, 0, end);
        }
    }

    public static void buildMaxHeap(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n - 1);
        }
    }

    public static void heapify(int[] arr, int i, int end) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left <= end && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right <= end && arr[right] > arr[largest]) {
            largest = right;
        }
        System.out.println("VETOR ORDENADO: " + Arrays.toString(arr));
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, end);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
