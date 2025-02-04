
package Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Maximum_and_mimimum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        System.out.println("enter the array number");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {


                if (arr[i] > arr[j]) {

                    int temp = 0;
                    temp=arr[i] ;
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("the sorted array is :" );
        for(int i=0;i<n; i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<n; i++){
            if(i==0){
                System.out.println("minimum :"+arr[i]);

            }
            else if(i==n-1) {
                System.out.println("max"+arr[i]);

            }

        }
    }
}
