public class customseries {
    public static void check(int n, int a, int b, int c, int d){
        for (int i = 0; i <n ; i++) {
            int g = (b-d);
            for (int j = 0; j < n;j++) {
                if(g == (j*c - a*i)){
                    System.out.println("the value is :" + (b+i*a));
                    return;
                }
                else{
                    System.out.println("no mathcing value");
                    return;
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        check(50, 20, 2, 9, 19);
    }
}
