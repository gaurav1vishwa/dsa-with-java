
//Write a program to reverse the array without using any extra array.(by the using of two pointer concept).


package ArrayList_questions;
import java.util.ArrayList;
import java.util.Scanner;
public class question_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
      //  ArrayList<Integer> arr = new ArrayList<>(5);

//        arr.add(0, 10);
//        arr.add(1, 20);
//        arr.add(2, 30);
//        arr.add(3, 40);
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //resverse the array Like - 40 30 20 10 ;
        int i = 0;
        int j = arr.length-1;
        while (i<=j) {

                int temp=0;

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;


            i++;
       j--;
            }
        for(int k=0;k<n;k++) {
            System.out.println(arr[k]);
        }
        }


    }





