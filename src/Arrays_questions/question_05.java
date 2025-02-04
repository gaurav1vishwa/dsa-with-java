
// Find the maximum value out of all the elements in the array.


package Arrays_questions;

 import java.security.spec.RSAOtherPrimeInfo;
 import java.util.Scanner;
public class question_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0;

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }



        for (int i = 0; i < n; i++) {
         if(arr[i]>max){
             arr[i]=max;
         }
        }
        System.out.println(max);

    }
}
