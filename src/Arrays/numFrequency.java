package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class numFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the query number : ");
        int q = sc.nextInt();
        boolean []visited = new boolean[n];
        Arrays.fill(visited,false);
      //  System.out.print("Enter the query number : ");
       // int q = sc.nextInt();
        for(int i=0; i<q; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = 0;
            for(int j=0; j<n; j++)
            {
                if(visited[j])
                    continue;
                int count =1;
                for(int k=j+1; k<n; k++)
                {
                    if(arr[j]==arr[k])
                    {
                        count++;
                        visited[k]=true;
                    }
                }
                if(count>=a && count<=b){
                    sum+=arr[j]*count;
                }
            }
            System.out.println(sum);
        }
    }
}
