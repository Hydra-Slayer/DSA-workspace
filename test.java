import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();

        int price = 1;
        while (code > 0) {
            price *= code % 10;
            code = code / 10;
        }
        System.out.println(price);
    }

}
