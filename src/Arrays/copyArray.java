package Arrays;

import java.util.Arrays;

public class copyArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        // we using for each loop go print the element ;
        for(int ele :arr){
            System.out.print( ele +" ");
          //  System.out.println();

        }
//        int brr[]=arr; // this array is sallo copy of the array
//        brr[0]=30;
//        System.out.println(arr[0]);
//        for(int ele: brr){
//            System.out.println(ele);
//        }
        // deep copy of array
        int crr[]= Arrays.copyOf(arr,arr.length);
        crr[0]=20;
        System.out.println(arr[0]);
    }
}
