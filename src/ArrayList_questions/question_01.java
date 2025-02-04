 /*        Basic Operations on ArrayList

      syntax of array list -  ArrayList <Integer> arraylist_name= new ArrayList<>( capacity of array list );


 basic operation on arraylist ;
 1-> arr.add(0,any number);     adding at the 0th index with any number

 2-> arr.add(any number);       adding any number at the last index;

 3->arr.set(0, 39);             set/update/modified the value at the index 0th with 39 ;

 4->arr.get(3);                 get the value at the index of 3 / or any index;


  */

package ArrayList_questions;

 import java.util.ArrayList;
 import java.util.Scanner;
 import java.util.concurrent.CopyOnWriteArrayList;

 public class question_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> arr=new ArrayList<>(5);
        // operation on arraylist
         arr.add(0,10);
         arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        System.out.println(arr);
        arr.add(79);
        System.out.println(arr);
        arr.set(1,23);

        System.out.println(arr.get(2));



    }
}
