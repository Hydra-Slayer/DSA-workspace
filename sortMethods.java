import java.util.Arrays;

public class sortMethods {

    public static void selectionSort(int[] arr) {
        // selection sort - T:O(N**2) S:O(1)
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
            arr[i] = min;
            arr[idx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        // Bubble Sort - T:O(N**2) S:O(1)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        // Insertion Sort - T:O(N**2) S:O(1)
        for (int i = 0; i <= arr.length - 1; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public class InnersortMethods {
        public static void mergeSort(int[] arr, int low, int high) {
            // Merge Sort - T:O(N* logN) S:O(N)
            if (low >= high) {
                return;
            }
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }

        private static void merge(int[] arr, int low, int mid, int high) {
            int size1 = mid - low + 1;
            int size2 = high - mid;
            int[] arr1 = new int[size1];
            int[] arr2 = new int[size2];

            // Copy data to temporary arrays arr1[] and arr2[]
            for (int i = 0; i < size1; i++) {
                arr1[i] = arr[low + i];
            }
            for (int j = 0; j < size2; j++) {
                arr2[j] = arr[mid + 1 + j];
            }

            // Initial indexes of the two subarrays and the merged subarray
            int i = 0, j = 0, k = low;

            // Merge the temporary arrays back into arr[low..high]. Directly adding back to
            // orignal array instead of a new temp one.
            while (i < size1 && j < size2) {
                if (arr1[i] <= arr2[j]) {
                    arr[k++] = arr1[i++];
                } else {
                    arr[k++] = arr2[j++];
                }
            }

            // Copy any remaining elements of arr1[], if there are any
            while (i < size1) {
                arr[k++] = arr1[i++];
            }

            // Copy any remaining elements of arr2[], if there are any
            while (j < size2) {
                arr[k++] = arr2[j++];
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

    public static void main(String[] args) {
        int[] arr = { 7, 5, 9, 2, 8 };
        // selectionSort(arr);
        // bubbleSort(arr);
        // insertionSort(arr);
        // InnersortMethods.mergeSort(arr, 0, arr.length - 1);
        recursiveBubble(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
