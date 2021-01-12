
public class BaruaNumber {
    public static void main(String args[])
    {
        int arr[]={512,2000000,10000000,100};
        int p=1,zero=0;
        for(int i=0;i<arr.length;i++)
        {
            while(arr[i]%10==0)
            {
                zero++;
                arr[i]=arr[i]/10;
            }
            p*=arr[i];
        }
        System.out.print(p);
        for(int i=0;i<zero;i++)
        {
            System.out.print("0");
        }
    }
}
