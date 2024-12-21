package condition;
import java.util.Scanner;
public class max_of_two_number {
    public static void main(String[] args) {
 Scanner  sc= new Scanner(System.in);
        System.out.println("enter first number ");
        int a=sc.nextInt();
        System.out.println("enter second  number ");
        int b=sc.nextInt();
        if(a>b) System.out.println("first is max"+ a);
        if(a==b) System.out.println("both are equal");
        else System.out.println("second is max" + b);

    }
}