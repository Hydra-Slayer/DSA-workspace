public class customlitres {
    public static void litres(int b, int plastic, int glass, int refund){
        if(glass-refund<plastic){
            int ans = Math.max((b-refund)/(glass-refund),0);
            b = ans*(glass-refund);
            ans+=b/plastic;
            System.out.println(ans);
        }
        else{
            System.out.println(b/plastic);
        }
    }
    public static void main(String[] args) {
        litres(10, 5, 9, 3);
    }
}
