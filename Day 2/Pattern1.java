public class Pattern1 {
    public static void main(String args[])
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(j<=i)
                {
                    if(j>=1)
                    {
                        System.out.print("*"+(i+1));
                    }
                    else
                    {
                        System.out.print(i+1);
                    }
                }
                
            }
            System.out.println();
        }
    }
}
