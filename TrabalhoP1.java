import java.util.Arrays;
import java.util.Scanner;

public class TrabalhoP1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] cartas = new int[50];
            boolean valoresInseridos = false;

            while (true) {
                System.out.println("BEM-VINDO! MENU:");
                System.out.println("1 - VALORES DAS CARTAS");
                System.out.println("2 - METODO BUBBLESORT");
                System.out.println("3 - METODO SELECTIONSORT");
                System.out.println("4 - METODO INSERCTIONSORT");
                System.out.println("5 - METODO QUICKSORT");
                System.out.println("6 - METODO HEAPSORT");
                System.out.println("7 - METODO MERGESORT");
                System.out.println("0 - SAIR");

                System.out.print("ESCOLHA UMA OPÇÃO: ");
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        valoresInseridos = true;
                        System.out.println("INFOMES OS VALORES DAS CARTAS (ENTRE 1 E 50):");
                        for (int i = 0; i < 50; i++) {
                            System.out.print("CARTA " + (i + 1) + ": ");
                            int valor = scanner.nextInt();
                            while (valor < 1 || valor > 50) {
                                System.out.println("VALOR INVALIDO, AS CARTAS DEVEM SER DE 1 A 50.");
                                System.out.print("CARTA " + (i + 1) + ": ");
                                valor = scanner.nextInt();
                            }
                            cartas[i] = valor;
                        }
                        System.out.println("VALORES DAS CARTAS INSERIDAS COM SUCESSO.");
                        break;
                    case 2:
                        if (valoresInseridos) {
                            int[] copiaBubblesort = Arrays.copyOf(cartas, cartas.length);
                            long tempoInicialBubbleSort = System.nanoTime();
                            bubbleSort(copiaBubblesort);
                            long tempoFinalBubbleSort = System.nanoTime();
                            System.out.println("TEMPO GASTO PELO BUBBLESORT: " + (tempoFinalBubbleSort - tempoInicialBubbleSort) + " nanossegundos");
                        } else {
                            System.out.println("OS VALORES DAS CARTAS NAO FORA INSERIDOS AINDA.");
                        }
                        break;
                    case 3:
                        if (valoresInseridos) {
                            int[] copiaSelectionsort = Arrays.copyOf(cartas, cartas.length);
                            long tempoInicialSelectionSort = System.nanoTime();
                            selectionSort(copiaSelectionsort);
                            long tempoFinalSelectionSort = System.nanoTime();
                            System.out.println("TEMPO GASTO PELO SELECTIONSORT: " + (tempoFinalSelectionSort - tempoInicialSelectionSort) + " nanossegundos");
                        } else {
                            System.out.println("OS VALORES DAS CARTAS NAO FORA INSERIDOS AINDA.");
                        }
                        break;
                    case 4:
                        if (valoresInseridos) {
                            int[] copiaInsertionsort = Arrays.copyOf(cartas, cartas.length);
                            long tempoInicialInsertionSort = System.nanoTime();
                            insertionSort(copiaInsertionsort);
                            long tempoFinalInsertionSort = System.nanoTime();
                            System.out.println("TEMPO GASTO PELO INSERTIONSORT: " + (tempoFinalInsertionSort - tempoInicialInsertionSort) + " nanossegundos");
                        } else {
                            System.out.println("OS VALORES DAS CARTAS NAO FORA INSERIDOS AINDA.");
                        }
                        break;
                    case 5:
                        if (valoresInseridos) {
                        int[] copiaQuicksort = Arrays.copyOf(cartas, cartas.length);
                        long tempoInicialQuicksort = System.nanoTime();
                        bubbleSort(copiaQuicksort);
                        long tempoFinalQuicksort = System.nanoTime();
                        System.out.println("TEMPO GASTO PELO QUICKSORT: " + (tempoFinalQuicksort - tempoInicialQuicksort) + " nanossegundos");
                    } else {
                        System.out.println("OS VALORES DAS CARTAS NAO FORA INSERIDOS AINDA.");
                    }
                        break;
                    case 6:
                        if (valoresInseridos) {
                            int[] copiaHeapsort = Arrays.copyOf(cartas, cartas.length);
                            long tempoInicialheapsort = System.nanoTime();
                            heapsort(copiaHeapsort);
                            long tempoFinalHeapsort = System.nanoTime();
                            System.out.println("TEMPO GASTO PELO HEAPSORT: " + (tempoFinalHeapsort - tempoInicialheapsort) + " nanossegundos");
                        } else {
                            System.out.println("OS VALORES DAS CARTAS NAO FORA INSERIDOS AINDA.");
                        }
                        break;
                    case 7:
                        if (valoresInseridos) {
                        int[] copiaMergepsort = Arrays.copyOf(cartas, cartas.length);
                        long tempoInicialmergepsort = System.nanoTime();
                        heapsort(copiaMergepsort);
                        long tempoFinalMergepsort = System.nanoTime();
                        System.out.println("TEMPO GASTO PELO Mergepsort: " + (tempoFinalMergepsort - tempoInicialmergepsort) + " nanossegundos");
                    } else {
                        System.out.println("OS VALORES DAS CARTAS NAO FORA INSERIDOS AINDA.");
                    }
                        break;
                    case 0:
                        System.out.println("SAINDO DO PROGRAMA.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("TENTE NOVAMENTE.");
                        break;
                }
            }
        }

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
