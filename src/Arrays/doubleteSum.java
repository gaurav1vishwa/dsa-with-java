package Arrays;

import java.util.ArrayList;

public class doubleteSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        int target=60;
        for(int i=0;i<arr.size();i++){
            int number=target-arr.get(i);
            for(int j=1;j<arr.size();j++){
                if(arr.get(j)==number){
                    System.out.println(arr.get(j)+" "+ (arr.get(j)+arr.get(i)));

                }

            }
break;
        }



    }
}
