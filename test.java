import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        
        String s = "hello";
        int count = 0;
        Pattern p = Pattern.compile("hell");
        Matcher m = p.matcher(s);
        while(m.find()){
            count++;
        }
        System.out.println();
        System.out.println(count);
    }
}
