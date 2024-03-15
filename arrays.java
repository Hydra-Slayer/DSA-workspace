import java.util.Arrays;
//define an array with this
class array_maker{
    public static int[] array_make(int a){
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i]=i;
        }
        return arr;
    }
}

//contains all the functions related to array
class array_fx{
    public static int[] prnt_even(int[] ary){
        int even_count = 0;
        for (int j = 0; j < ary.length; j++) {
            if (ary[j]%2==0) {
                even_count++;
            }
        }
        int[] even = new int[even_count];
        int idxe=0;
        for (int i = 0; i < ary.length; i++) {
            if (ary[i]%2==0) {
                even[idxe]= ary[i];
                idxe++;
            }
        }
        return even;
    }
    public static int[] rev_ary(int[] ary, int start, int end){
        
        while (start<end) {
            int temp = ary[start];
            ary[start]=ary[end];
            ary[end]= temp;
            start++;
            end--;
        }
        return ary;
    }
    static int min(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }
    static int secMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                secondMax=max;
                max = arr[i];
            }
            else if (arr[i]> secondMax && secondMax!=max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    static int[] movZeros(int[] arr){
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0 && arr[j] ==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
            if(arr[j] !=0){
                j++;
            }
        }
        return arr;
    }
    static int[] resize(int arr[], int capacity){
        int[] arr_ex = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            arr_ex[i]= arr[i];
        }

        return arr_ex;
    }
    static int missingVal(int[] arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }
        return sum;
    }
//class end
}





class arrays {
    //main method
    public static void main(String[] args) {
        // making array object
        // int[] arr1 = array_maker.array_make(5);
        // int[] arr2 = array_maker.array_make(8);
        int[] arr3 = {1,3,4,5};
        //calling methods
        // int even_arr[] = array_fx.prnt_even(arr1);
        

        //printing outputs
        // System.out.println(Arrays.toString(even_arr));
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(array_fx.rev_ary(arr1, 0, 2)));
        // System.out.println(array_fx.min(array_fx.rev_ary(arr1, 0, 2)));
        
        
        System.out.println(Arrays.toString(arr3));
        // System.out.println(array_fx.secMax(arr2));
        // System.out.println(Arrays.toString(array_fx.movZeros(arr3)));
        // System.out.println(Arrays.toString(array_fx.resize(arr3, arr3.length*3)));
        System.out.println(array_fx.missingVal(arr3));
        
    }
}
