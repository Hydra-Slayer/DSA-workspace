import java.util.Scanner;

public class stackUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        String ch;
        int data,c=0;
        while(true){
            ch = sc.next();
            switch (ch) {
                case "Push":
                    data = sc.nextInt();
                    try{
                        a[c++] = data;
                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("Exception: " + e.getMessage());
                        c--;
                    }
                    break;
                case "Pop":
                    a[--c] = 0;
                    break;
                case "Print":
                    for(int i =0; i<c; i++){
                        System.out.println(a[i]);
                    }
                default:
                    break;
            }

        }
    }
}
