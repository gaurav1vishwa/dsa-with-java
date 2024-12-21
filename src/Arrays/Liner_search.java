package Arrays;
import java.util.Scanner;
public class Liner_search {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array element :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("your array element is :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
