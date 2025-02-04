// Merge two sorted arrays

package Arrays_questions;
import java.util.Scanner;

public class question_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of array1 ;");
        int m=sc.nextInt();
        System.out.println("enter the length of array2 ;");
        int n=sc.nextInt();

        int[] arr =new int[m];
        int[] arr1 =new int[n];


        for(int i=0;i<m;i++){
            arr[i]= sc.nextInt();

        }

        for(int i=0;i<0;i++){
            arr1[i]=sc.nextInt();
        }
        int k=m+n;
        int arr2[]=new int[k];
        int j=arr1.length-1;
        for(int i=0;i<n;i++){
            if(arr[i]<=arr1[j]){
                arr2[i]=arr[i];
                i++;
                k++;
            }
        }


    }
}
