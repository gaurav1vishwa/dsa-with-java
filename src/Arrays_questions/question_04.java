
// Find the element ‘x’ in the array . Take array and x as input.

package Arrays_questions;
import java.util.Scanner;
public class question_04 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the element that you want to find :");
         int x= sc.nextInt();
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element in array");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("recive the element :");
                break;
            }
        }





    }
}
