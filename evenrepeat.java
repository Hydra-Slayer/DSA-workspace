import java.util.ArrayList;

public class evenrepeat {
    static int count = 0;
    static void fx(String s){
        int count = 1;
        int sum = 0;
        ArrayList<Integer> alist = new ArrayList<>();
        for (int i = 1; i <s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                count++;
            }
            else{
                if (count %2 ==0) {
                    sum+=count;
                    alist.add(count);
                }
                count = 1;
            }
        }
        //check for the last codition since the loop exits with if exected for the last same sequence. 
        if(count%2==0){
            sum+=count;
            alist.add(count);
        }
        System.out.println(alist);
        System.out.println(sum);
        
    }
    
    
    
    public static void main(String[] args) {
        
        fx("aabbbbdcc");
    }
}
