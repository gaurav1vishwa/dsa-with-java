/* Rotate the given array ‘a’ by k steps, where k is
non-negative.
        Note : k can be greater than n as well where n is the size of array ‘a’.
*/

package ArrayList_questions;
import java.util.Scanner;
public class question_03 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        System.out.println("enter the no.of step you want to rotate");
        int k=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element :");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
}