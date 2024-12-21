package Arrays;

public class PassingArrayToMethod {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        System.out.println(arr[1]);
        change(arr);
       // System.out.println(arr[1]);

    }
    public static void change(int arr[]){
        arr[1]=25;
        System.out.println(arr[1]);     //  this is called pass by referance (when we pass any array in method);
    }
}
