import java.util.ArrayList;


public class rec {
    public static int fact_find(int num){
        if(num<=0){
            return 1;
        }
        else{

            return num*fact_find(num-1);
        }
        
    }
    char[] swap(char[] arr, int fidx, int i){
        char temp = arr[i];
        arr[i] = arr[fidx];
        arr[fidx] = temp;
        return arr;
    }
    void call(char[] str, int n, int fidx){
        ArrayList<String> list = new ArrayList<String>();
        if (fidx == n-1){
            list.add(new String(str));
            return ;
        }
        for(int i = fidx; i<n; i++){
            swap(str, fidx,i);
            call(str, n, fidx+1);
            swap(str, fidx, i);
        }
        System.out.println(list);
    }

    void validParenthesis(String s, int open, int close, int num){

        
        if (close == num) {
            System.out.print(s);    
            return;
        }
        if(open < num){
            validParenthesis(s+"(", open + 1, close, num);
        }
        if(close < open){
            validParenthesis( s + ")", open, close + 1, num);
        }

    }
    
    public static int factorPairs(int n){
        int count = 0;
        for(int i = 1; i*i <=n; i++){
            if(n%i ==0 && (n/i!=i)){
                count++;
            }
        }
        return count;
    }



    //main method
    public static void main(String[] args) {
        //object made
        rec obj = new rec();

        // fx calls
        // System.out.println(fact_find(5));
        // System.out.println(factorPairs(14));
        // char[] swapList = {'A','B','C'};
        // obj.call(swapList, 3, 0);
        obj.validParenthesis(" ", 0, 0, 3);
        
        
    }
}
