package Day1;
class Pattern2
{
    public static void main(String args[])
    {
        int odd=1;
        int sp=8;
        for (int i=1; i<=9;i++)
        {
            for (int j=1;j<=sp;j++)
            {
            System.out.print(" ");
            }
            sp--;
           
            for (int k=1; k<i;k++)
            {
            System.out.print(k+" ");
            }
            System.out.println();
            
    }
    }
}