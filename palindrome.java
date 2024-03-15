import java.util.Scanner;

public class palindrome {
    static boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while (start<end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        
        System.out.println(isPalindrome(text));

    }
}
