import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class arrays_easy5 {
    public static void max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println(max);
    }

    public static void min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n <= min) {
                min = n;
            }
        }
        System.out.println(min);
    }

    public static void secMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secmax = max;
        for (int n : arr) {
            if (n > max) {
                secmax = max;
                max = n;
            } else if (n > secmax && n != max) {
                secmax = n;
            }
        }
        System.out.println(secmax);
    }

    public static void secondMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int sec = min;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                sec = min;
                min = arr[i];
            } else if (arr[i] < sec && arr[i] != min) {
                sec = arr[i];
            }
        }
        System.out.println(sec);
    }

    public static void isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
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

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
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

    public static int[] findUnion(int[] arr1, int[] arr2) {
        ArrayList<Integer> alist = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            // Skip duplicates inside arr1
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            // Skip duplicates inside arr2
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }
            if (arr1[i] < arr2[j]) { // If arr1 is smaller
                alist.add(arr1[i++]); // Add arr1
            } else if (arr1[i] > arr2[j]) { // If arr2 is smaller
                alist.add(arr2[j++]); // Add arr2 (Fix: add from arr2, increment j)
            } else { // If equal
                alist.add(arr1[i]);
                i++;
                j++;
            }
        }
        while (i < arr1.length) {
            // Check against previous element added to alist (or arr1[i-1])
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            alist.add(arr1[i++]);
        }

        // Fix for arr2 cleanup
        while (j < arr2.length) {
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }
            alist.add(arr2[j++]);
        }
        return alist.stream().filter(n -> n != null).mapToInt(n -> n).toArray();
    }

    // max len subarray with sum k brute force T:O(N^3)
    // S:O(1) only work for positives.
    public static int maxLenSubbrute(int[] arr, int k) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }

    // max len subarray with sum k. T:O(N)
    // S: O(1) works only for positives.
    public static int maxLenSuboptimal(int[] arr, int k) {
        int ans = 0, right = 0, left = 0, sum = 0;
        while (right < arr.length) {
            sum += arr[right];
            while (sum > k && left <= right) {
                sum -= arr[left++];
            }
            if (sum == k) {
                ans = Math.max(ans, right - left + 1);
            }
            right++;
        }
        return ans;
    }

    // max len subarray with sum k. T:O(N)
    // S:O(N). works for both positives and negatives and zeroes.
    public static int maxLenSubBetter(int[] arr, int k) {
        HashMap<Long, Integer> map = new HashMap<>();
        int ans = 0;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                ans = Math.max(ans, i + 1);
            }
            long rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                ans = Math.max(ans, len);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 7, 2, 1, 4, 2 };
        System.out.println();
        System.out.println(maxLenSubBetter(arr, 7));
    }
}
