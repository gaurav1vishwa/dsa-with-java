package condition;

import  java .util.Scanner;
public class ternary_operator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a= sc.nextInt();
        System.out.println("enter second number");
        int b= sc.nextInt();
        System.out.println("enter second number");
        int c= sc.nextInt();


         int var;
        //var=(a>b)? a: b;
       var= (a>b)?(a>c ?a:c):(b>c? b:c);
        System.out.println(var);



    }

}
