
import java.util.Scanner;


public class DeleteArray {
    public static void main(String args[])
    {
       
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        //delete beginning
        for(int i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        n--;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
           
        }
        //delete from position
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter position to delete");
        int pos=sc.nextInt();
        for(int i=pos;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        n--;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
           
        }
    }
}
