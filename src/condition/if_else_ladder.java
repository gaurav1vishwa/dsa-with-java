package condition;
 import  java .util.Scanner;
public class if_else_ladder {
    public static void main(String[] args) {
 // there are only one if block and multiple else if block
         Scanner sc= new Scanner(System.in);
        System.out.println("enter your amount");
          int a=sc.nextInt();
        if(a>100){
            System.out.println("mangoes ");
        }
        else if(a<=100 && a>50){
            System.out.println("oranges");
        }
        else if(a>=0 && a<=50){
            System.out.println("grapes ");
        }

        else {
            System.out.println("you can't buy anything ");
        }






    }

}
