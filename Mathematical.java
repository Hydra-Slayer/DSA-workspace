import java.util.ArrayList;

public class Mathematical {
    public static void count_digits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.println(count);
    }

    public static void reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println(reversed);
    }

    public static void gcd(int n1, int n2) {
        while (n1 != 0 && n2 != 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }

        int gcd = (n1 == 0) ? n2 : n1;
        System.out.println(gcd);
    }

    public static void armstrong(int n) {
        int temp = n;
        int sum = 0;
        int k = String.valueOf(n).length();
        while (n > 0) {
            sum = (int) (sum + Math.pow(n % 10, k));
            n /= 10;
        }
        boolean ans = (sum == temp) ? true : false;
        System.out.println(ans);
    }

    public static void printDivisors(int num) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int temp = 1;
        while (temp < Math.sqrt(num)) {
            if (num % temp == 0) {
                divisors.add(temp);
                divisors.add(num / temp);
            }
            temp++;
        }
        System.out.println(divisors.toString());

    }

    public static void isPrime(int num) {
        int temp = 2;
        boolean ans = true;
        while (temp < num) {
            if (num % temp == 0) {
                ans = false;
                break;
            }
            temp++;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        // reverse(123);
        // gcd(3, 6);
        // armstrong(153);
        // printDivisors(6);
        // count_digits(116);
        // isPrime(4);
    }
}