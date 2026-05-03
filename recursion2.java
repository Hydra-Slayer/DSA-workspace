import java.util.*;

public class recursion2 {
    public static void show(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        show(num - 1);
    }

    public static void printnx(int num, String nameString) {
        if (num == 0) {
            return;
        }
        System.out.println(nameString);
        printnx(num - 1, nameString);
    }

    public static void printndesc(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        printndesc(num - 1);
    }

    public static void printnasc(int num) {
        if (num == 0) {
            return;
        }
        printnasc(num - 1);
        System.out.println(num);
    }

    public static void sum(int num, int sum) {
        if (num == 0) {
            System.out.println(sum);
            return;
        }
        sum += num;
        sum(num - 1, sum);
    }

    public static void fact(int num, int prod) {
        if (num == 1) {
            System.out.println(prod);
            return;
        }
        prod *= num;
        fact(num - 1, prod);
    }

    static void reverseArray(int arr[], int start, int end) {
        if (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray(arr, start + 1, end - 1);
        }
    }

    static boolean palindrome(int i, String s) {
        // Base Condition
        if (i >= s.length() / 2) {
            System.out.println("True");
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            System.out.println("False");
            return false;
        }
        return palindrome(i + 1, s);
    }

    // O(n)
    static int fibonacci(int N) {
        // Base Condition.
        if (N <= 1) {
            return N;
        }
        int last = fibonacci(N - 1);
        int slast = fibonacci(N - 2);
        return last + slast;
    }

    public static void main(String[] args) {
        // show(3);
        // printnx(5, "hello");
        // printndesc(5);
        // printnasc(5);
        // sum(6, 0);
        // fact(5, 1);
        // int[] arr = { 1, 2, 3, 4, 5 };
        // reverseArray(arr, 0, 4);
        // System.out.println(Arrays.toString(arr));
        // palindrome(0, "racecar");
        System.out.println(fibonacci(8));
    }
}
