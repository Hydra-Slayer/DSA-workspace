import java.util.*;
class geeks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String output = removeDuplicates(input);
        System.out.println(output);
        sc.close();
        
    }
    public static String removeDuplicates(String input){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<input.length(); i++){
            char currentChar = input.charAt(i);
            if(result.indexOf(String.valueOf(currentChar)) == -1){
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}