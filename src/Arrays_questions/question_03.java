
// Calculate the sum of all the elements by taking the input

package Arrays_questions;
import java.util.Scanner;
public class question_03 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
       arr[i]= sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
           sum=sum + arr[i];
        }
        System.out.println(" the sum of all elements :"+sum);



    }
}
