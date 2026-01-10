import java.util.Arrays;

public class arrays_easy {
    public static void min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n <= min) {
                min = n;
            }
        }
        System.out.println(min);
    }

    public static void secondMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int sec = min;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                sec = min;
                min = arr[i];
            }
        }
        System.out.println(sec);
    }

    public static void isSorted(int[] arr) {
        boolean check = true;
        if (arr.length == 1) {
            System.out.println(check);
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        System.out.println(check);

    }

    public static void removeDupsSorted(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j] && i != j) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] reverse(int[] arr, int l, int r) {
        while (l <= r) {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;

        }
        return arr;
    }

    // left rotate by 1.
    public static void lr(int[] arr) {
        arr = reverse(arr, 1, arr.length - 1);
        arr = reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // override for left rotate
    public static void lr(int[] arr, int n) {
        arr = reverse(arr, 0, n);
        arr = reverse(arr, n + 1, arr.length - 1);
        arr = reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // move zeroes to the end
    public static void moveZeros(int[] arr) {
        int j = -1;
        // place the pointer j:
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // no non-zero elements:
        if (j == -1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        // Move the pointers i and j
        // and swap accordingly:
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap a[i] & a[j]:
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void find(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("element at :" + i);
                break;
            }

        }
        System.out.println("element not present.");
    }

    public static void maxConsecutive(int[] arr, int digit) {
        int count = 0;
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == digit) {
                temp++;
            } else {
                temp = 0;
            }
            count = Math.max(temp, count);
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 6, 7 };
        System.out.println();
        min(arr);
    }
}
