import java.util.Arrays;

public class MergeSort {
    public static void mergesort(int[] arr) {
        System.out.println(" METODO MERGESORT:");
        int n = arr.length;
        int mid = n / 2;

        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }

        mergesort(left);
        mergesort(right);

        merge(left, right, arr);
    }

    private static void merge(int[] left, int[] right, int[] arr) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        System.out.println("VETOR ORDENADO: " + Arrays.toString(arr));
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }

    }
}
