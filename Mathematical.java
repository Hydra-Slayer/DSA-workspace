import java.lang.Math;
public class Mathematical{
    static void gcd(int n1,int n2){
        if(n1 == 0 || n2 == 0){
            System.out.println(Math.max(n1, n2));
            return;
        }
        int diff = Math.abs(n1-n2);
        gcd(diff, Math.min(n1, n2));
    }
    static void gcd_log(int n1, int n2){
        while(n1>0 && n2 > 0){
            if(n1>n2){
                n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }
        }
        if(n1==0){
            System.out.println(n2);
        }
        if(n2==0){
            System.out.println(n1);
        }
    }
    public static void armstrong(int n){
        int digit = 0;
        int sum = 0;
        int nCopy = n;
        while(n>0){
            digit = n%10;
            sum = sum +(digit * digit * digit);
            n = n/10;
        }
        if (sum == nCopy){
            System.err.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static void allDivisors(int n){
        for(int i = 1; i<= Math.sqrt(n); i++){
            if(n%i==0){
                if(i == n/i){
                    System.out.print(i);
                    continue;
                }
                System.out.print(i);
                System.out.print(" ");
                System.out.print(n/i);
                System.out.print(" ");
            }
        }
    }
    public static void is_Prime(int n){
        int count = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n%i==0){
                count++;
                if((n/i) != i){
                    count++;
                }
            }
            if(count == 2){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
    public static void main(String[] args) {
        // int gcd = 0;
        // int num1 = 10;
        // int num2 = 15;
        System.out.println();
        // gcd(10,15);
        // gcd_log(num1, num2);
        // armstrong(371);
        allDivisors(36);
        is_Prime(7);
    }
}