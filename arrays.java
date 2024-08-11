import java.util.Arrays;
import java.util.Random;
//define an array with this
class array_maker{
    public static int[] array_make(int a){
        Random random = new Random();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i]=random.nextInt(a+1);
        }
        return arr;
    }
}

//contains all the functions related to array
class array_fx{
//search and inserting algortihms
    //insert element at index
    public static int[] insert_at(int[] arr , int pos, int value){
        int[] new_array = new int[arr.length+1];
        for(int i = pos; i<arr.length; i++){
            new_array[i+1] = arr[i];
        }
        new_array[pos] = value;
        return new_array;
    }
    // remove array element at index
    public static int[] rem_at(int[] arr, int pos){
        int[] new_array = new int[arr.length-1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != pos) {
                new_array[j++] = arr[i];
            }
        }

        return new_array;
    }
    // remove all even elements
    public static int[] rem_even(int[] arr){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
        }

        int[] new_array = new int[arr.length-count];
        
        for (int i = 0, j = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                new_array[j++] = arr[i];
            }
        }
        return new_array;
    }
    //remove the odd elements
    public static int[] rem_odd(int[] arr){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        int[] new_array = new int[arr.length-count];
        for(int i = 0, j = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                new_array[j++] = arr[i];
            }
        }
        return new_array;
    }

    //find maximum element
    public static int find_max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }

    //find second maximum element
    public static int find_sec_max(int[] arr){
        int max = Integer.MIN_VALUE;
        int sec_max = max;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                sec_max = max;
                max = arr[i];
            }
            else if (arr[i] != max && arr[i] >sec_max) {
                sec_max = arr[i];
            }
        }
        return sec_max;
    }
// sorting algoirthms
    //selection sort algorithm
    public static int[] selection_sort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int min = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    //bubble sort algorithm
    public static int[] bubble_sort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int didSwap = 0;
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }
        }
        return arr;
    }

    //insertion sort algorithm
    public static int[] insertion_sort(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }

    //merge sort algorithm
    public static int[] merge_sort(int[] arr){
        if(arr.length<=1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];
        for(int i = 0; i<mid; i++){
            left[i] = arr[i];
        }
        for(int i = mid, j = 0; i<arr.length; i++, j++){
            right[j] = arr[i];
        }
        left = merge_sort(left);
        right = merge_sort(right);
        return merge(left, right);
    }
    private static int[] merge(int[] left, int[] right){
        int[] new_array = new int[left.length+right.length];
        int i = 0, j = 0, k = 0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                new_array[k++] = left[i++];
            }
            else{
                new_array[k++] = right[j++];
            }
        }
        while(i<left.length){
            new_array[k++] = left[i++];
        }
        while(j<right.length){
            new_array[k++] = right[j++];
        }
        return new_array;
    }


    //check if sorted
    public static boolean checkSorted(int[] arr){
        boolean flag = true;
        for(int i = 0; i<arr.length-1; i++){
            
            if(arr[i]>arr[i+1]){
                flag = false;
            }
            if(arr[arr.length-1]<arr[arr.length-2]){
                flag = false;
            }
        }
        return flag;
    }

    //remove duplicates from sorted
    public static int[] rem_dupes(int[] arr){
        if(array_fx.checkSorted(arr) == true){
            int count = 0;
            int temp = arr[0];
            for(int i = 0; i<arr.length; i++){
                
                if(arr[i] != temp){
                    count++;
                    temp = arr[i];
                }
            }
            int[] new_array = new int[count+1];
            
            for(int i = 0, j=0; i<arr.length; i++){
                
                if(arr[i] != temp){
                    new_array[j++] = arr[i];
                    temp = arr[i];
                }
            }
            return new_array;
        }
        return arr;
        
    }

    //rotate an array left by n place  //brute force
    public static int[] rotate_left(int[] arr, int n){
        n = n%arr.length-1;
        int[] temp = new int[n];
        //store in temp array
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        //shift by n places
        for (int i = n; i < arr.length; i++) {
            arr[i-n] = arr[i];
        }
        //add the temp back to origional array
        for (int i = arr.length-n; i < arr.length; i++) {
            arr[i] = temp[i+n-arr.length];
        }
        return arr;
    }
    //rotate left by n places //space optimal
    public static int[] rotate_left_optimal(int[] arr, int n){
        n = n%arr.length-1;
        array_fx.reverse(arr, 0, n);
        array_fx.reverse(arr, n+1, arr.length-1);
        array_fx.reverse(arr, 0, arr.length-1);
        return arr;
    }
    private static int[] reverse(int[] arr, int start, int end){
        
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    //move zeroes to end

}





class arrays {
    //main method
    public static void main(String[] args) {
        int[] array = array_maker.array_make(7);
        // int[] sol_array = array_fx.insert_at(array , 0 , 19);
        // int [] sol_array = array_fx.rem_at(array, 0);
        // int[] sol_array = array_fx.rem_even(array);
        // int[] sol_array = array_fx.rem_odd(array);
        System.out.println(Arrays.toString(array));
        // System.out.println(Arrays.toString(sol_array));
        // System.out.println(array_fx.find_sec_max(array));
        // int[] sol_array = array_fx.merge_sort(array);
        
        System.out.println(Arrays.toString(array_fx.rotate_left_optimal(array,2)));
        
    }
}

