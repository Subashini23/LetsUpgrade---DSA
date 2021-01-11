
import java.util.Scanner;
import java.util.Stack;

public class MaxStack {

     
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no.of elements");
        int size =sc.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<size;i++)
        {
            s.push(sc.nextInt());
        }
        int max=0;
        for(int i=0;i<size-1;i++)
        {
            int ele = s.pop();
            if(ele>max)
            {
                max=ele;
            }
        }
        System.out.print("Max "+max);
    }

    
}
