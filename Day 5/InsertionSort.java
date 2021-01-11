public class InsertionSort {
    public static void main(String args[])
    {
        int arr[]={24,45,12,75,35,5,74,68};
        int temp;
        for(int i=1;i<arr.length;i++)
        {
            int pos=i;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[pos]<arr[j])
                {
                    temp=arr[pos];
                    arr[pos]=arr[j];
                    arr[j]=temp;
                }
                pos=j;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}