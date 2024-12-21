package condition;
import java .util.Scanner;
public class max_of_three_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System .out.println("ente first number ");
        int a= sc.nextInt();
        System.out.println("ente second number ");
        int b= sc.nextInt();

         System.out.println("ente third  number ");
         int c= sc.nextInt();
         if(a>b && a>c) System.out.println(" a is max "+ " "+a);
         else if(b>a && b>c) System.out.println(" b is max "+ " "+b);
         else System.out.println("c is max "+" "+c);
    }
}
