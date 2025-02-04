// Find the secondlargest element in the given Array.

package Arrays_questions;

import java.util.Scanner;

public class question_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the element in array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        for (int i = 0; i < n; i++) {
//            if (arr[i] < arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = arr[i];
//            }
//        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=0;
                if(arr[i]<arr[j]) {

                     temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }

        System.out.println("the second largest element is :"+ arr[1]);
    }
}