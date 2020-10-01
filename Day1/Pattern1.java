package Day1;
class Pattern
{
    public static void main(String args[])
    {
        int odd=1;
        int sp=10;
        for (int i=0;i<9;i++)
        {
            for (int j=0;j<sp;j++)
            {
                System.out.print(" ");
            }
            sp--;
            for (int j=1;j<=i;j++)
            {
                System.out.print(i+" " );
            }
            System.out.println();
        }
        
    }
    
}