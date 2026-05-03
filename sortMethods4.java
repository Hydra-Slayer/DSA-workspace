import java.util.ArrayList;
import java.util.Arrays;

public class sortMethods4 {

    public static void selectionSort(int[] arr) {
        // selection sort - T:O(N**2) S:O(1)
        // select the minimum and set it at the start
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        // Bubble Sort - T:O(N**2) S:O(1)
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        // Insertion Sort - T:O(N**2) S:O(1)
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j--];
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }

    public class InnersortMethods {
        public static void mergeSort(int[] arr, int l, int h) {
            if (l >= h) {
                return;
            }
            int mid = (h + l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }

        private static void merge(int[] arr, int l, int m, int h) {
            ArrayList<Integer> alist = new ArrayList<>();
            int left = l, right = m + 1;
            while (left <= m && right <= h) {
                if (arr[left] < arr[right]) {
                    alist.add(arr[left++]);
                } else {
                    alist.add(arr[right++]);
                }
            }
            while (left <= m) {
                alist.add(arr[left++]);
            }
            while (right <= h) {
                alist.add(arr[right++]);
            }
            for (int i = l; i <= h; i++) {
                arr[i] = alist.get(i - l);
            }
        }
    }

    public static void recursiveBubble(int[] arr, int n) {
        // Best case T: O(N), Worst case: O(N**2) S: O(N)
        // Remeber it has limit till the stack of the OS or env.
        // Base case: range == 1.
        if (n == 1)
            return;

        int didSwap = 0;
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = 1;
            }
        }

        // if no swapping happens means array already sorted so stops further recursive
        // calls
        if (didSwap == 0)
            return;
        // Range reduced after recursion:
        recursiveBubble(arr, n - 1);
    }

    public static void recursiveInsertion(int[] arr, int n) {
        // Best case T: O(N) S:O(1)
        if (n <= 0) {
            return;
        }

        recursiveInsertion(arr, n - 1);

        int j = n;
        while (j > 0 && arr[j] < arr[j - 1]) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j--;
        }
    }

    public class QuickSort {
        public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                // Partition the array
                int pivotIndex = partition(arr, low, high);

                // Recursively sort left and right subarrays
                quickSort(arr, low, pivotIndex - 1);
                quickSort(arr, pivotIndex + 1, high);
            }
        }

        private static int partition(int[] arr, int low, int high) {
            int pivot = arr[high]; // Choose last element as pivot
            int i = low - 1; // Index of smaller element

            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            // Swap pivot (arr[high]) to its correct position
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1; // Return pivot index
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 5, 9, 2, 8 };
        // selectionSort(arr);
        // bubbleSort(arr);
        // insertionSort(arr);
        InnersortMethods.mergeSort(arr, 0, arr.length - 1);
        // recursiveBubble(arr, arr.length);
        // recursiveInsertion(arr, arr.length - 1);
        // QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
