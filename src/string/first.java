package string;

import java.util.Arrays;
import java.util.Scanner;

public class first {

    public static void main(String[] args) {
//        int m=2;
//        int n = 2;
        int arr[]={2,4};
        int arr1[] = {24,36};

        int counter = 0;
        int min = Arrays.stream(arr1).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        for(int i=max; i<=min; i++) {
            int c=0;
            int d = 0;
            for (int j = 0; j <arr.length; j++) {
                if(i%arr[j]==0 ){
                    c++;
                }

            }
            for (int j = 0; j <arr1.length; j++) {
                if(arr1[j]%i==0){
                    d++;
                }

            }
            if(c==arr.length && d==arr1.length){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
