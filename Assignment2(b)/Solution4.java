import java.util.Scanner;
class Solution4{

public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value for element you want to add");
	int n=sc.nextInt();
	int a[] =new int[n];
	int c1=0,c2=0;
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		
	}
    sc.close();
     for(int i=0;i<n-2;i++)
     {
    	 
    		 if(a[i]>a[i+1])
    			 c1=0; 
    		 else if(a[i]<a[i+1]) 
    			 c2=0; 
    	 }
     
      
    	 if(c1==1)
    	 System.out.println("Decending ");
        else if(c2==1)
    	 System.out.println("Ascending");
       
    else System.out.println("Random");
     
     
     }

}

