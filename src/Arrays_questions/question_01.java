
 /* Given an array of marks of students, if the mark of any
student is less than 35 print its roll number. roll number
here refers to the index of the array.  */


package Arrays_questions;
import java.util.Scanner;

public class question_01 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] < 35) {
                System.out.println("the roll no. is : " + arr[i]);

            }

        }
    }
}
