//Count the number of elements in given array greater than a given number x.

package Arrays_questions;
import java.util.Scanner;
public class question_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element that you want to perform the operation :");
        int x= sc.nextInt();
        int counter=0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(arr[i]>=x){
                counter++;
            }
        }
        System.out.println("the number of arrays greater than the number is :"+counter);


    }
}
