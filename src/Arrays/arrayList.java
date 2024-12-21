package Arrays;
import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        // construct a array list
        // in java arraylist is just like vactor in cpp
        // array is fixed sized that why we use arraylist   , it is kind of dynamic array uing opps concept ;
        ArrayList<Integer> arr =new ArrayList<>(6);
        // operation on array list ;
//        arr.add(32);
//        arr.add(32);
//        arr.add(43);
//        arr.add(53);
//        arr.add(63);
        System.out.println(arr.size()); // initally the size of array is 0 and the capacity of array is six
//        //System.out.println(arr);
//      for( int i=0;i<arr.size();i++){
//          System.out.println(arr.get(i)+" "+ arr.size());
//      }
//      arr.set(1,33);
//        System.out.println(arr.get(1));
//
//arr.add(73);
//        System.out.println(arr.get(5) + " "+arr.size());
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        for( int i=0;i<arr.size();i++){
      System.out.println(arr.get(i)+" "+ arr.size());
     }
    }
}
