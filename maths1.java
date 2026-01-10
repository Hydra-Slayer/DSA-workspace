public class maths1 {

    // count digits O(log10n)
    public static void count_digits(int x) {
        int count = 0;
        while (x > 0) {
            count++;
            x = x / 10;
        }
        System.out.println(count);
    }

    // count digits using formula logn+1. O(1)
    public static void count_Digits_best(int x) {
        int count = (int) Math.log10(x) + 1;
        System.out.println(count);
    }

    // reverse a number O(log10n)
    public static void reverse_num(int x) {
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        System.out.println(rev);
    }

    // check number palindrome
    public static void check_palindrome(int x) {

        int temp = x;
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        System.out.println(rev == temp);
    }

    // find gcd. runs from 1 to min(x,y). O(min(n1,n2))
    public static void gcd(int x, int y) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(x, y); i++) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    // same TC but executes less times as we start from greatest to smalles.
    // O(min(n1,n2)).
    public static void gcd_better(int x, int y) {
        for (int i = Math.min(x, y); i > 0; i--) {
            if (x % i == 0 && y % i == 0) {
                System.out.println(i);
                break;
            }

        }
    }

    // euclidian algo for gcd O(min(n1,n2))
    public static int gcd_best(int x, int y) {
        while (x > 0 && y > 0) {
            if (x > y) {
                x = x % y;
            } else {
                y = y % x;
            }
        }
        if (x == 0) {
            return y;
        }
        return x;
    }

    // armstrong number O(log10n + 1)
    public static void armstrong(int x) {
        int sum = 0;
        int count = 0;
        int temp = x;
        int temp1 = x;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        while (temp1 > 0) {
            int digit = temp1 % 10;
            sum += Math.pow(digit, count);
            temp1 /= 10;
        }
        System.out.println(sum == x);
    }

    // print all divisors O(sqrtN)
    public static void print_all_divisors(int x) {
        for (int i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
                if (x / i != i) {
                    System.out.println(x / i);
                }
            }

        }
    }

    // check prime O(sqrtN)
    public static void is_prime(int x) {
        boolean is_prime = true;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                is_prime = false;
                break;
            }
        }
        System.out.println(is_prime);
    }

    public static void main(String[] args) {
        System.out.println();
        is_prime(7);
    }
}
