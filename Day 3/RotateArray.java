
import java.util.Scanner;

public class RotateArray {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for(int i=0;i<k;i++)
        {
            int a = arr[0];
            for(int j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=a;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}
